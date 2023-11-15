package com.prodemy.gen16.akademik.controller;

import com.prodemy.gen16.akademik.model.MataKuliah;
import com.prodemy.gen16.akademik.service.MataKuliahService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/mata-kuliah")
public class MataKuliahController {

    @Autowired
    private MataKuliahService mataKuliahService;

    @GetMapping
    public ResponseEntity<List<MataKuliah>> getAll() {
        return ResponseEntity.ok(mataKuliahService.getAll());
    }

    @PostMapping
    public ResponseEntity<String> insert(@RequestBody MataKuliah mataKuliah) {
        mataKuliahService.insert(mataKuliah);
        return ResponseEntity.ok(mataKuliah.getKode());
    }

    @GetMapping(path = "/{kode}")
    public ResponseEntity<MataKuliah> get(@PathVariable("kode") String kode) {
        return ResponseEntity.ok(mataKuliahService.getByKode(kode));
    }

    @PutMapping(path = "/{kode}")
    public ResponseEntity<String> update(
            @PathVariable("kode") String kode,
            @RequestBody MataKuliah mataKuliah
    ) {
        return ResponseEntity.ok(mataKuliahService.updateByKode(kode, mataKuliah));
    }

    @DeleteMapping(path = "/{kode}")
    public ResponseEntity<String> delete(@PathVariable("kode") String kode) {
        mataKuliahService.deleteByKode(kode);
        return ResponseEntity.ok("ok");
    }
}
