package com.engeto.vozovyPark;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


/**
 * Zapiš aplikaci, která bude ukládat a zpracovávat data o vozidlech firemní flotily aut.
 * O každém vozidle ukládáme následující údaje:
 *
 *     značku (make): textová položka,
 *     typ (type): textová položka,
 *     registrační značka (vehicleRegistrationPlate): text bez mezer,
 *     datum poslední STK (lastTechnicalCheck): datum,
 *     najetá vzdálenost (mileage): celé číslo.
 *
 *
 Vypiš značku, model a registrační značku vozidel, které mají jít na STK tento měsíc
 (tedy předchozí STK proběhla před více než 11 měsíci).
 Přidej do vozového parku 20 nových vozidel Hyundai i40 s registračními značkami
 ENGETO01 až ENGETO20 s nájezdem 40 km. Všechny absolvovaly technickou kontrolu právě dnes.
 (Pro přidání použijte cyklus, mačkat Ctrl-C a Ctrl-V by tě stejně nebavilo!)

 */


public class Main {

    public static void technicalCheckThisMonth (Car car) {
        System.out.print(" - last technical check was: " + car.lastTechnicalCheck + " - ");
        if (car.lastTechnicalCheck.plusMonths(24).isBefore(LocalDate.now())){
            System.out.println("You have missed technical check");
        }
        else if (car.lastTechnicalCheck.plusMonths(24).isEqual(LocalDate.now()) ||
                car.lastTechnicalCheck.plusMonths(24).isBefore(LocalDate.now().plusMonths(1))){
            System.out.print("Technical check is in month - check this car: ");
            System.out.println(car.make + " " + car.type + " " + car.vehicleRegistrationPlate);
        }
        else System.out.println("Technical check is OK, you can relax");
    }


    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();

        carList.add(new Car("Škoda", "Octavia", "1A23425",
                LocalDate.of(2020,7,12), 98405));
        carList.add(new Car("Opel", "Astra", "161914",
                LocalDate.of(2021,3,10), 98405));
        carList.add(new Car("Renault", "Megane", "2B38736",
                LocalDate.of(2022,11,13), 157352));

        for (int i = 1; i <= 20; i++){
            String registrationPlate;
            if (i < 10){
                registrationPlate = "ENGETO0" + i;
            } else {
                registrationPlate = "ENGETO" + i;
            }
            carList.add(new Car("Hyundai", "i40", registrationPlate,
                    LocalDate.now(), 40));
        }

        for (Car car : carList){
            System.out.print(car.type + " (" + car.vehicleRegistrationPlate + ")");
            technicalCheckThisMonth(car);
        }

    }
}