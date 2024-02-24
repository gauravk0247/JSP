package model;

import java.time.LocalDate;

public class Flight {
private int flightId;
private String flightName;
private String fSrc;
private String fDest;
private LocalDate fDate;
private double fPrice;
public int getFlightId() {
return flightId;
}
public void setFlightId(int flightId) {
this.flightId = flightId;
}
public String getFlightName() {
return flightName;
}
public void setFlightName(String flightName) {
this.flightName = flightName;
}
public String getfSrc() {
return fSrc;
}
public void setfSrc(String fSrc) {
this.fSrc = fSrc;
}
public String getfDest() {
return fDest;
}
public void setfDest(String fDest) {
this.fDest = fDest;
}
public LocalDate getfDate() {
return fDate;
}
public void setfDate(LocalDate fDate) {
this.fDate = fDate;
}
public double getfPrice() {
return fPrice;
}
public void setfPrice(double fPrice) {
this.fPrice = fPrice;
}

}
