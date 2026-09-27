package com.elifsu.ilk_apim;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // mutfak kısmı dışarıdan gelen bağlantıları ve istekleri bu sınıfın içinde karşılayacağız
public class MerhabaController {

    @GetMapping("/elifsu") // şipariş alma kısmı 
    public String ilkMesaj() {
        return " Spring Boot ile ilk API'mi yazdim. Backend dunyasina hos geldik!";
    }
    @GetMapping("/selam")
    public String ikinciMesaj() {
    	return "Ikinci endpoint basariyla calisiyor.";
    }
}