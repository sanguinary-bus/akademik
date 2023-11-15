package com.prodemy.gen16.akademik.controller;

import com.prodemy.gen16.akademik.model.Fakultas;
import com.prodemy.gen16.akademik.service.FakultasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/fakultas")
public class FakultasController {

    @Autowired
    private FakultasService fakultasService;

    @GetMapping
    public ResponseEntity<List<Fakultas>> getAll() {
        return ResponseEntity.ok(fakultasService.getAll());
    }

    @GetMapping(path = "/q/{nama}")
    public ResponseEntity<List<Fakultas>> getAllByNama(@PathVariable("nama") String nama) {
        return ResponseEntity.ok(fakultasService.getAllByNamaContaining(nama));
    }

    @PostMapping
    public ResponseEntity<String> insert(@RequestBody Fakultas fakultas) {
        fakultasService.insert(fakultas);
        return ResponseEntity.ok(fakultas.getKode());
    }

    @PostMapping(path = "/{kode}/{nama}")
    public ResponseEntity<String> insert(@PathVariable("kode") String kode, @PathVariable("nama") String nama) {
        fakultasService.insert(new Fakultas(kode, nama));
        return ResponseEntity.ok(kode);
    }

    @PostMapping(path = "/param")
    public ResponseEntity<String> insertParam(@RequestParam("kode") String kode, @RequestParam("nama") String nama) {
        fakultasService.insert(new Fakultas(kode, nama));
        return ResponseEntity.ok(kode);
    }

    @GetMapping(path = "/{kode}")
    public ResponseEntity<Fakultas> get(@PathVariable("kode") String kode) {
        return ResponseEntity.ok(fakultasService.getByKode(kode));
    }

    @PutMapping(path = "/{kode}")
    public ResponseEntity<String> update(
            @PathVariable("kode") String kode,
            @RequestBody Fakultas fakultas
    ) {
        return ResponseEntity.ok(fakultasService.updateByKode(kode, fakultas));
    }

    @DeleteMapping(path = "/{kode}")
    public ResponseEntity<String> delete(@PathVariable("kode") String kode) {
        fakultasService.deleteByKode(kode);
        return ResponseEntity.ok("ok");
    }
}
