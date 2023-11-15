package com.prodemy.gen16.akademik.controller;

import com.prodemy.gen16.akademik.model.Dosen;
import com.prodemy.gen16.akademik.service.DosenService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "/dosen")
public class DosenController {

    @Autowired
    private DosenService dosenService;

    @GetMapping
    @ResponseBody
    public ResponseEntity<List<Dosen>> getAll() {
        return ResponseEntity.ok(dosenService.getAll());
    }

    @PostMapping
    @ResponseBody
    public ResponseEntity<String> insert(@RequestBody Dosen dosen) {
        dosenService.insert(dosen);
        return ResponseEntity.ok(dosen.getKode());
    }

    @GetMapping(path = "/{kode}")
    @ResponseBody
    public ResponseEntity<Dosen> get(@PathVariable("kode") String kode) {
        return ResponseEntity.ok(dosenService.getByKode(kode));
    }

    @PutMapping(path = "/{kode}")
    @ResponseBody
    public ResponseEntity<String> update(
            @PathVariable("kode") String kode,
            @RequestBody Dosen dosen) {
        return ResponseEntity.ok(dosenService.updateByKode(kode, dosen));
    }

    @DeleteMapping(path = "/{kode}")
    @ResponseBody
    public ResponseEntity<String> delete(@PathVariable("kode") String kode) {
        dosenService.deleteByKode(kode);
        return ResponseEntity.ok("ok");
    }

    // =============================================================================

    @GetMapping("/index")
    public String fetchAllDosenHtml(Model model) {
        List<Dosen> dosenList = dosenService.getAll();

        model.addAttribute("dosenList", dosenList);

        return "dosen/index";
    }

    @PostMapping("/index")
    public String insertDosenHtml(@ModelAttribute Dosen dosenReq, Model model) {
        dosenService.insert(dosenReq);

        List<Dosen> dosenList = dosenService.getAll();

        model.addAttribute("dosenList", dosenList);

        return "dosen/dosen";
    }

    @GetMapping("/index/add")
    public String fetchAllDosenForAddInputHtml(Model model) {
        List<Dosen> dosenList = dosenService.getAll();

        model.addAttribute("dosenList", dosenList);

        return "dosen/dosen-add";
    }

    @GetMapping("/index/{kode}")
    public String getDosenByKodeHtml(
            @PathVariable("kode") String kode,
            Model model) {
        Dosen dosen = dosenService.getByKode(kode);

        model.addAttribute("dosen", dosen);

        return "dosen/row";
    }

    @PutMapping("/index/{kode}")
    public String updateDosenByKodeHtml(
            @PathVariable("kode") String kode,
            @ModelAttribute Dosen dosenReq,
            Model model) {
        String updatedDosenId = dosenService.updateByKode(kode, dosenReq);
        Dosen dosen = dosenService.getByKode(updatedDosenId);

        model.addAttribute("dosen", dosen);

        return "dosen/row";
    }

    @DeleteMapping("/index/{kode}")
    public String updateDosenByKodeHtml(
            @PathVariable("kode") String kode,
            Model model) {
        dosenService.deleteByKode(kode);

        List<Dosen> dosenList = dosenService.getAll();

        model.addAttribute("dosenList", dosenList);

        return "dosen/dosen";
    }

    @GetMapping("/index/edit/{kode}")
    public String fetchDosenByKodeForEditInputHtml(
            @PathVariable("kode") String kode,
            Model model) {
        Dosen dosen = dosenService.getByKode(kode);

        model.addAttribute("dosen", dosen);

        return "dosen/row-edit";
    }
}
