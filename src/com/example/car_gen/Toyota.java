package com.example.car_gen;

 public class Toyota extends Car {
  private boolean greatGasMileage;

  public Toyota(String color, int year, int speed, int maxSpeed, boolean greatGasMileage) {
   super(color, year, speed, maxSpeed);
   this.greatGasMileage = greatGasMileage;
  }

  public boolean isGreatGasMileage() {
   return greatGasMileage;
  }

  public void setGreatGasMileage(boolean greatGasMileage) {
   this.greatGasMileage = greatGasMileage;
  }
 }
