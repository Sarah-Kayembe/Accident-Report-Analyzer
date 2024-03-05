/**
 * Report - allows for a file to be read and 
 * its data printed to the console window.
 * @author Professor Mansouri  and esther greene 
 * @version March 4, 2024
 */

package accidentpack;

import java.time.LocalDate;

public class Report implements Comparable<Report>{
    private String id;
    private int severity;
    private LocalDate startTime;
    private LocalDate endTime;
    private String street;
    private String city;
    private String county;
    private String state;
    private int temperature;
    private int humidity;
    private int visibility;
    private String weatherCondition;
    private boolean crossing;
    private boolean sunrise;
    
    
    /**
     * Constructs an AccidentReport object with the specified attributes.
     *
     * @param ID               the ID of the accident report
     * @param severity         the severity of the accident
     * @param startTime        the start time of the accident
     * @param endTime          the end time of the accident
     * @param street           the street where the accident occurred
     * @param city             the city where the accident occurred
     * @param county           the county where the accident occurred
     * @param state            the state where the accident occurred
     * @param temperature      the temperature at the time of the accident
     * @param humidity         the humidity at the time of the accident
     * @param visibility       the visibility at the time of the accident
     * @param weatherCondition the weather condition at the time of the accident
     * @param crossing         whether there was a crossing involved in the accident
     * @param sunriseSunset    the sunrise/sunset time at the time of the accident
     */
    public Report(String id, int severity, LocalDate startTime, LocalDate endTime, 
            String street, String city, String county, String state, int temperature,
            int humidity, int visibility, String weatherCondition, boolean crossing,
            boolean sunrise)
    {
        this.id = id;
        this.severity = severity;
        this.startTime = startTime;
        this.endTime = endTime;
        this.street = street;
        this.city = city;
        this.county = county;
        this.state = state;
        this.temperature = temperature;
        this.humidity = humidity;
        this.visibility = visibility;
        this.weatherCondition = weatherCondition;
        this.crossing = crossing;
        this.sunrise = sunrise;
    }
    
    /**
     * @return the id
     */
    public String getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * @return the severity
     */
    public int getSeverity() {
        return severity;
    }
    /**
     * @param severity the severity to set
     */
    public void setSeverity(int severity) {
        this.severity = severity;
    }
    /**
     * @return the startTime
     */
    public LocalDate getStartTime() {
        return startTime;
    }
    /**
     * @param startTime the startTime to set
     */
    public void setStartTime(LocalDate startTime) {
        this.startTime = startTime;
    }
    /**
     * @return the crossing
     */
    public boolean isCrossing() {
        return crossing;
    }
    /**
     * @param crossing the crossing to set
     */
    public void setCrossing(boolean crossing) {
        this.crossing = crossing;
    }
    /**
     * @return the subrise
     */
    public boolean isSunrise() {
        return sunrise;
    }
    /**
     * @param subrise the subrise to set
     */
    public void setSunrise(boolean sunrise) {
        this.sunrise = sunrise;
    }
    /**
     * @return the weather_condition
     */
    public String getWeatherCondition() {
        return weatherCondition;
    }
    /**
     * @param weather_condition the weather_condition to set
     */
    public void setWeatherCondition(String weatherCondition) {
        this.weatherCondition = weatherCondition;
    }
    /**
     * @return the endTime
     */
    public LocalDate getEndTime() {
        return endTime;
    }
    /**
     * @param endTime the endTime to set
     */
    public void setEndTime(LocalDate endTime) {
        this.endTime = endTime;
    }
    /**
     * @return the stree
     */
    public String getStreet() {
        return street;
    }
    /**
     * @param stree the stree to set
     */
    public void setStreet(String street) {
        this.street = street;
    }
    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }
    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }
    /**
     * @return the county
     */
    public String getCounty() {
        return county;
    }
    /**
     * @param county the county to set
     */
    public void setCounty(String county) {
        this.county = county;
    }
    /**
     * @return the state
     */
    public String getState() {
        return state;
    }
    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }
    /**
     * @return the temperature
     */
    public int getTemperature() {
        return temperature;
    }
    /**
     * @param temperature the temperature to set
     */
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
    /**
     * @return the humidity
     */
    public int getHumidity() {
        return humidity;
    }
    /**
     * @param humidity the humidity to set
     */
    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
    /**
     * @return the visibility
     */
    public int getVisibility() {
        return visibility;
    }
    /**
     * @param visibility the visibility to set
     */
    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    /**
     * Used to compare two given startTimes
     */
    @Override
    public int compareTo(Report otherReport) {
        return this.startTime.compareTo(otherReport.getStartTime());
    } 
    
    /**
     * returns state and date of Report
     */
    @Override
    public String toString()
    {
        return startTime.toString() + " " + county;
    }
}
