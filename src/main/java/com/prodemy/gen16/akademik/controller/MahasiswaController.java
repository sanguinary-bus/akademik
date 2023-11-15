package com.prodemy.gen16.akademik.controller;

import com.prodemy.gen16.akademik.model.Mahasiswa;
import com.prodemy.gen16.akademik.service.MahasiswaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/mahasiswa")
public class MahasiswaController {

    @Autowired
    private MahasiswaService mahasiswaService;

    @GetMapping
    public ResponseEntity<List<Mahasiswa>> getAll() {
        return ResponseEntity.ok(mahasiswaService.getAll());
    }

    @PostMapping
    public ResponseEntity<String> insert(@RequestBody Mahasiswa mahasiswa) {
        mahasiswaService.insert(mahasiswa);
        return ResponseEntity.ok(mahasiswa.getNim());
    }

    @GetMapping(path = "/{nim}")
    public ResponseEntity<Mahasiswa> get(@PathVariable("nim") String nim) {
        return ResponseEntity.ok(mahasiswaService.getByNim(nim));
    }

    @PutMapping(path = "/{nim}")
    public ResponseEntity<String> update(
            @PathVariable("nim") String nim,
            @RequestBody Mahasiswa mahasiswa
    ) {
        return ResponseEntity.ok(mahasiswaService.updateByNim(nim, mahasiswa));
    }

    @DeleteMapping(path = "/{nim}")
    public ResponseEntity<String> delete(@PathVariable("nim") String nim) {
        mahasiswaService.deleteByNim(nim);
        return ResponseEntity.ok("ok");
    }
}