package com.frames1.controller;

import com.frames1.model.CarroModel;
import com.frames1.repository.CarroRepositorio;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


@ManagedBean
@ViewScoped
public class CarroController {
    
    private CarroModel carroModelo = new CarroModel();
    private CarroRepositorio carroRepositorio = new CarroRepositorio();
    
    public void salvar(){
        this.carroRepositorio.salvar(carroModelo);
    }

    public CarroModel getCarroModelo() {
        return carroModelo;
    }

    public void setCarroModelo(CarroModel carroModelo) {
        this.carroModelo = carroModelo;
    }
    
}
