package com.prodemy.gen16.akademik.controller;

import com.prodemy.gen16.akademik.model.Pengampu;
import com.prodemy.gen16.akademik.model.PengampuId;
import com.prodemy.gen16.akademik.service.PengampuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/pengampu")
public class PengampuController {

    @Autowired
    private PengampuService pengampuService;

    @GetMapping
    public ResponseEntity<List<Pengampu>> getAll() {
        return ResponseEntity.ok(pengampuService.getAll());
    }

    @PostMapping
    public ResponseEntity<String> insert(@RequestBody PengampuId pengampuId) {
        pengampuService.insert(new Pengampu(pengampuId));
        return ResponseEntity.ok("ok");
    }

    @PostMapping(path = "/{kodeDosen}/{kodeMataKuliah}")
    public ResponseEntity<String> insert(
            @PathVariable("kodeDosen") String kodeDosen,
            @PathVariable("kodeMataKuliah") String kodeMataKuliah
    ) {
        PengampuId pengampuId = new PengampuId(kodeDosen, kodeMataKuliah);
        pengampuService.insert(new Pengampu(pengampuId));
        return ResponseEntity.ok("ok");
    }


    @DeleteMapping
    public ResponseEntity<String> delete(@RequestBody PengampuId pengampuId) {
        pengampuService.deleteById(pengampuId);
        return ResponseEntity.ok("ok");
    }

    @DeleteMapping(path = "/{kodeDosen}/{kodeMataKuliah}")
    public ResponseEntity<String> delete(
            @PathVariable("kodeDosen") String kodeDosen,
            @PathVariable("kodeMataKuliah") String kodeMataKuliah
    ) {
        PengampuId pengampuId = new PengampuId(kodeDosen, kodeMataKuliah);
        pengampuService.deleteById(pengampuId);
        return ResponseEntity.ok("ok");
    }
}
