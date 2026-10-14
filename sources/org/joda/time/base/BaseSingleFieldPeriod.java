package org.joda.time.base;

import defpackage.a;
import java.io.Serializable;
import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.DurationField;
import org.joda.time.DurationFieldType;
import org.joda.time.MutablePeriod;
import org.joda.time.Period;
import org.joda.time.PeriodType;
import org.joda.time.ReadableInstant;
import org.joda.time.ReadablePartial;
import org.joda.time.ReadablePeriod;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.field.FieldUtils;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseSingleFieldPeriod implements ReadablePeriod, Comparable<BaseSingleFieldPeriod>, Serializable {
    private static final long START_1972 = 63072000000L;
    private static final long serialVersionUID = 9386874258972L;
    private volatile int iPeriod;

    public BaseSingleFieldPeriod(int i10) {
        this.iPeriod = i10;
    }

    public static int between(ReadableInstant readableInstant, ReadableInstant readableInstant2, DurationFieldType durationFieldType) {
        if (readableInstant == null || readableInstant2 == null) {
            throw new IllegalArgumentException("ReadableInstant objects must not be null");
        }
        return durationFieldType.getField(DateTimeUtils.getInstantChronology(readableInstant)).getDifference(readableInstant2.getMillis(), readableInstant.getMillis());
    }

    public static int between(ReadablePartial readablePartial, ReadablePartial readablePartial2, ReadablePeriod readablePeriod) {
        if (readablePartial == null || readablePartial2 == null) {
            throw new IllegalArgumentException("ReadablePartial objects must not be null");
        }
        if (readablePartial.size() != readablePartial2.size()) {
            throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
        }
        int size = readablePartial.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (readablePartial.getFieldType(i10) != readablePartial2.getFieldType(i10)) {
                throw new IllegalArgumentException("ReadablePartial objects must have the same set of fields");
            }
        }
        if (!DateTimeUtils.isContiguous(readablePartial)) {
            throw new IllegalArgumentException("ReadablePartial objects must be contiguous");
        }
        Chronology chronologyWithUTC = DateTimeUtils.getChronology(readablePartial.getChronology()).withUTC();
        return chronologyWithUTC.get(readablePeriod, chronologyWithUTC.set(readablePartial, START_1972), chronologyWithUTC.set(readablePartial2, START_1972))[0];
    }

    public static int standardPeriodIn(ReadablePeriod readablePeriod, long j10) {
        if (readablePeriod == null) {
            return 0;
        }
        ISOChronology instanceUTC = ISOChronology.getInstanceUTC();
        long jSafeAdd = 0;
        for (int i10 = 0; i10 < readablePeriod.size(); i10++) {
            int value = readablePeriod.getValue(i10);
            if (value != 0) {
                DurationField field = readablePeriod.getFieldType(i10).getField(instanceUTC);
                if (!field.isPrecise()) {
                    StringBuilder sbA = a.a("Cannot convert period to duration as ");
                    sbA.append(field.getName());
                    sbA.append(" is not precise in the period ");
                    sbA.append(readablePeriod);
                    throw new IllegalArgumentException(sbA.toString());
                }
                jSafeAdd = FieldUtils.safeAdd(jSafeAdd, FieldUtils.safeMultiply(field.getUnitMillis(), value));
            }
        }
        return FieldUtils.safeToInt(jSafeAdd / j10);
    }

    @Override // java.lang.Comparable
    public int compareTo(BaseSingleFieldPeriod baseSingleFieldPeriod) {
        if (baseSingleFieldPeriod.getClass() == getClass()) {
            int value = baseSingleFieldPeriod.getValue();
            int value2 = getValue();
            if (value2 > value) {
                return 1;
            }
            return value2 < value ? -1 : 0;
        }
        throw new ClassCastException(getClass() + " cannot be compared to " + baseSingleFieldPeriod.getClass());
    }

    @Override // org.joda.time.ReadablePeriod
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReadablePeriod)) {
            return false;
        }
        ReadablePeriod readablePeriod = (ReadablePeriod) obj;
        return readablePeriod.getPeriodType() == getPeriodType() && readablePeriod.getValue(0) == getValue();
    }

    @Override // org.joda.time.ReadablePeriod
    public int get(DurationFieldType durationFieldType) {
        if (durationFieldType == getFieldType()) {
            return getValue();
        }
        return 0;
    }

    public abstract DurationFieldType getFieldType();

    @Override // org.joda.time.ReadablePeriod
    public DurationFieldType getFieldType(int i10) {
        if (i10 == 0) {
            return getFieldType();
        }
        throw new IndexOutOfBoundsException(String.valueOf(i10));
    }

    @Override // org.joda.time.ReadablePeriod
    public abstract PeriodType getPeriodType();

    public int getValue() {
        return this.iPeriod;
    }

    @Override // org.joda.time.ReadablePeriod
    public int getValue(int i10) {
        if (i10 == 0) {
            return getValue();
        }
        throw new IndexOutOfBoundsException(String.valueOf(i10));
    }

    @Override // org.joda.time.ReadablePeriod
    public int hashCode() {
        return getFieldType().hashCode() + ((getValue() + 459) * 27);
    }

    @Override // org.joda.time.ReadablePeriod
    public boolean isSupported(DurationFieldType durationFieldType) {
        return durationFieldType == getFieldType();
    }

    public void setValue(int i10) {
        this.iPeriod = i10;
    }

    @Override // org.joda.time.ReadablePeriod
    public int size() {
        return 1;
    }

    @Override // org.joda.time.ReadablePeriod
    public MutablePeriod toMutablePeriod() {
        MutablePeriod mutablePeriod = new MutablePeriod();
        mutablePeriod.add(this);
        return mutablePeriod;
    }

    @Override // org.joda.time.ReadablePeriod
    public Period toPeriod() {
        return Period.ZERO.withFields(this);
    }
}
