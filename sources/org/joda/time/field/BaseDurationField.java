package org.joda.time.field;

import defpackage.a;
import java.io.Serializable;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseDurationField extends DurationField implements Serializable {
    private static final long serialVersionUID = -2554245107589433218L;
    private final DurationFieldType iType;

    public BaseDurationField(DurationFieldType durationFieldType) {
        if (durationFieldType == null) {
            throw new IllegalArgumentException("The type must not be null");
        }
        this.iType = durationFieldType;
    }

    @Override // java.lang.Comparable
    public int compareTo(DurationField durationField) {
        long unitMillis = durationField.getUnitMillis();
        long unitMillis2 = getUnitMillis();
        if (unitMillis2 == unitMillis) {
            return 0;
        }
        return unitMillis2 < unitMillis ? -1 : 1;
    }

    @Override // org.joda.time.DurationField
    public int getDifference(long j10, long j11) {
        return FieldUtils.safeToInt(getDifferenceAsLong(j10, j11));
    }

    @Override // org.joda.time.DurationField
    public long getMillis(int i10) {
        return getUnitMillis() * ((long) i10);
    }

    @Override // org.joda.time.DurationField
    public long getMillis(long j10) {
        return FieldUtils.safeMultiply(j10, getUnitMillis());
    }

    @Override // org.joda.time.DurationField
    public final String getName() {
        return this.iType.getName();
    }

    @Override // org.joda.time.DurationField
    public final DurationFieldType getType() {
        return this.iType;
    }

    @Override // org.joda.time.DurationField
    public int getValue(long j10) {
        return FieldUtils.safeToInt(getValueAsLong(j10));
    }

    @Override // org.joda.time.DurationField
    public int getValue(long j10, long j11) {
        return FieldUtils.safeToInt(getValueAsLong(j10, j11));
    }

    @Override // org.joda.time.DurationField
    public long getValueAsLong(long j10) {
        return j10 / getUnitMillis();
    }

    @Override // org.joda.time.DurationField
    public final boolean isSupported() {
        return true;
    }

    @Override // org.joda.time.DurationField
    public String toString() {
        StringBuilder sbA = a.a("DurationField[");
        sbA.append(getName());
        sbA.append(']');
        return sbA.toString();
    }
}
