package gaia.domain.model;

import com.google.common.base.Objects;

public class Result extends SecureObject {

    private static final String USER_FRIENDLY_NAME = "Result";

    private double value;
    private String unit;
    private String sampleFraction;
    private String statusIdentifier;
    private String valueType;

    public static String getUserFriendlyName() {
        return USER_FRIENDLY_NAME;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getSampleFraction() {
        return sampleFraction;
    }

    public void setSampleFraction(String sampleFraction) {
        this.sampleFraction = sampleFraction;
    }

    public String getStatusIdentifier() {
        return statusIdentifier;
    }

    public void setStatusIdentifier(String statusIdentifier) {
        this.statusIdentifier = statusIdentifier;
    }

    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id, tenant, customId, value, unit, sampleFraction, statusIdentifier, valueType);
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
                .add("id", id)
                .add("tenant", tenant)
                .add("customId", customId)
                .add("value", value)
                .add("unit", unit)
                .toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof Result)) {
            return false;
        }
        return equals((Result) obj);
    }

    public boolean equals(final Result other) {
        return Objects.equal(unit, other.unit) &&
                Objects.equal(id, other.id) &&
                Objects.equal(tenant, other.tenant) &&
                Objects.equal(customId, other.customId) &&
                Objects.equal(sampleFraction, other.sampleFraction) &&
                Objects.equal(statusIdentifier, other.statusIdentifier) &&
                Objects.equal(valueType, other.valueType);
    }
}
