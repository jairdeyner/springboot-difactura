package com.jair.curso.springboot.di.factura.springboot_difactura;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
// import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import com.jair.curso.springboot.di.factura.springboot_difactura.models.Item;
import com.jair.curso.springboot.di.factura.springboot_difactura.models.Product;

@Configuration
@PropertySource(value = "classpath:data.properties", encoding = "UTF-8")
public class AppConfig {

    // @Primary
    @Bean("default")
    List<Item> itemsInvoice() {
        Product product1 = new Product("Camara Sony", 800);
        Product product2 = new Product("Bicicleta Bianchi 26", 1200);

        return Arrays.asList(new Item(product1, 2), new Item(product2, 4));
    }

    @Bean
    List<Item> itemsInvoiceOffice() {
        Product product1 = new Product("Monitor Asus 24", 700);
        Product product2 = new Product("Notebook Razer", 2400);
        Product product3 = new Product("Impresora Hp", 800);
        Product product4 = new Product("Escritorio Oficina", 900);

        return Arrays.asList(
                new Item(product1, 4),
                new Item(product2, 6),
                new Item(product3, 1),
                new Item(product4, 4));
    }
}
