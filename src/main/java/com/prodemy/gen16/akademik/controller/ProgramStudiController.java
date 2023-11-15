package com.prodemy.gen16.akademik.controller;

import com.prodemy.gen16.akademik.model.ProgramStudi;
import com.prodemy.gen16.akademik.service.ProgramStudiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/program-studi")
public class ProgramStudiController {

    @Autowired
    private ProgramStudiService programStudiService;

    @GetMapping
    public ResponseEntity<List<ProgramStudi>> getAll() {
        return ResponseEntity.ok(programStudiService.getAll());
    }

    @PostMapping
    public ResponseEntity<String> insert(@RequestBody ProgramStudi programStudi) {
        programStudiService.insert(programStudi);
        return ResponseEntity.ok(programStudi.getKode());
    }

    @GetMapping(path = "/{kode}")
    public ResponseEntity<ProgramStudi> get(@PathVariable("kode") String kode) {
        return ResponseEntity.ok(programStudiService.getByKode(kode));
    }

    @PutMapping(path = "/{kode}")
    public ResponseEntity<String> update(
            @PathVariable("kode") String kode,
            @RequestBody ProgramStudi programStudi
    ) {
        return ResponseEntity.ok(programStudiService.updateByKode(kode, programStudi));
    }

    @DeleteMapping(path = "/{kode}")
    public ResponseEntity<String> delete(@PathVariable("kode") String kode) {
        programStudiService.deleteByKode(kode);
        return ResponseEntity.ok("ok");
    }
}
