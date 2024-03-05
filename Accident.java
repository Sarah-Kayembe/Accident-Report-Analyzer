/*
 * Accident class represents an accident record.
 * Author: Sarah Kayembe
 * Date: Mon, 4 March, 2024
 * Disclaimer: The code comments were generated using ChatGPT to explain the functionality of the code.
 * StackOverflow was also used for solving errors and addressing missing packages.
 * Getters and setters were generated using getter and setter generate command.
 */

package accidentpack;

import java.util.Date;

/**
 * Accident class represents an accident record.
 */
public class Accident {

    private String ID;
    private int severity;
    private Date startTime;
    private Date endTime;
    private String street;
    private String city;
    private String county;
    private String state;
    private double temperature;
    private double humidity;
    private double visibility;
    private String weatherCondition;
    private String crossing;
    private String sunriseSunset;

    /**
     * Constructs an Accident object with the given attributes.
     * @param ID The ID of the accident.
     * @param severity The severity level of the accident.
     * @param startTime The start time of the accident.
     * @param endTime The end time of the accident.
     * @param street The street where the accident occurred.
     * @param city The city where the accident occurred.
     * @param county The county where the accident occurred.
     * @param state The state where the accident occurred.
     * @param temperature The temperature at the time of the accident.
     * @param humidity The humidity at the time of the accident.
     * @param visibility The visibility at the time of the accident.
     * @param weatherCondition The weather condition at the time of the accident.
     * @param crossing The type of crossing at the accident location.
     * @param sunriseSunset Indicates whether the accident occurred during sunrise or sunset.
     */
    public Accident(String ID, int severity, Date startTime, Date endTime, String street, String city, String county,
            String state, double temperature, double humidity, double visibility, String weatherCondition,
            String crossing, String sunriseSunset) {
        this.ID = ID;
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
        this.sunriseSunset = sunriseSunset;
    }

    // Getters and Setters with Javadoc comments

    /**
     * Gets the ID of the accident.
     * @return The ID of the accident.
     */
    public String getID() {
        return ID;
    }

    /**
     * Sets the ID of the accident.
     * @param ID The ID of the accident to set.
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * Gets the severity level of the accident.
     * @return The severity level of the accident.
     */
    public int getSeverity() {
        return severity;
    }

    /**
     * Sets the severity level of the accident.
     * @param severity The severity level of the accident to set.
     */
    public void setSeverity(int severity) {
        this.severity = severity;
    }

    /**
     * Gets the start time of the accident.
     * @return The start time of the accident.
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * Sets the start time of the accident.
     * @param startTime The start time of the accident to set.
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * Gets the end time of the accident.
     * @return The end time of the accident.
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * Sets the end time of the accident.
     * @param endTime The end time of the accident to set.
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * Gets the street where the accident occurred.
     * @return The street where the accident occurred.
     */
    public String getStreet() {
        return street;
    }

    /**
     * Sets the street where the accident occurred.
     * @param street The street where the accident occurred to set.
     */
    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * Gets the city where the accident occurred.
     * @return The city where the accident occurred.
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the city where the accident occurred.
     * @param city The city where the accident occurred to set.
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * Gets the county where the accident occurred.
     * @return The county where the accident occurred.
     */
    public String getCounty() {
        return county;
    }

    /**
     * Sets the county where the accident occurred.
     * @param county The county where the accident occurred to set.
     */
    public void setCounty(String county) {
        this.county = county;
    }

    /**
     * Gets the state where the accident occurred.
     * @return The state where the accident occurred.
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the state where the accident occurred.
     * @param state The state where the accident occurred to set.
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * Gets the temperature at the time of the accident.
     * @return The temperature at the time of the accident.
     */
    public double getTemperature() {
        return temperature;
    }

    /**
     * Sets the temperature at the time of the accident.
     * @param temperature The temperature at the time of the accident to set.
     */
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    /**
     * Gets the humidity at the time of the accident.
     * @return The humidity at the time of the accident.
     */
    public double getHumidity() {
        return humidity;
    }

    /**
     * Sets the humidity at the time of the accident.
     * @param humidity The humidity at the time of the accident to set.
     */
    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    /**
     * Gets the visibility at the time of the accident.
     * @return The visibility at the time of the accident.
     */
    public double getVisibility() {
        return visibility;
    }

    /**
     * Sets the visibility at the time of the accident.
     * @param visibility The visibility at the time of the accident to set.
     */
    public void setVisibility(double visibility) {
        this.visibility = visibility;
    }

    /**
     * Gets the weather condition at the time of the accident.
     * @return The weather condition at the time of the accident.
     */
    public String getWeatherCondition() {
        return weatherCondition;
    }

    /**
     * Sets the weather condition at the time of the accident.
     * @param weatherCondition The weather condition at the time of the accident to set.
     */
    public void setWeatherCondition(String weatherCondition) {
        this.weatherCondition = weatherCondition;
    }

    /**
     * Gets the type of crossing at the accident location.
     * @return The type of crossing at the accident location.
     */
    public String getCrossing() {
        return crossing;
    }

    /**
     * Sets the type of crossing at the accident location.
     * @param crossing The type of crossing at the accident location to set.
     */
    public void setCrossing(String crossing) {
        this.crossing = crossing;
    }

    /**
     * Gets the indication of whether the accident occurred during sunrise or sunset.
     * @return The indication of whether the accident occurred during sunrise or sunset.
     */
    public String getSunriseSunset() {
        return sunriseSunset;
    }

    /**
     * Sets the indication of whether the accident occurred during sunrise or sunset.
     * @param sunriseSunset The indication of whether the accident occurred during sunrise or sunset to set.
     */
    public void setSunriseSunset(String sunriseSunset) {
        this.sunriseSunset = sunriseSunset;
    }
}

