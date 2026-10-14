package org.joda.time.chrono;

import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;
import org.joda.time.field.DecoratedDateTimeField;
import org.joda.time.field.FieldUtils;

/* JADX INFO: loaded from: classes3.dex */
class ISOYearOfEraDateTimeField extends DecoratedDateTimeField {
    public static final DateTimeField INSTANCE = new ISOYearOfEraDateTimeField();
    private static final long serialVersionUID = 7037524068969447317L;

    private ISOYearOfEraDateTimeField() {
        super(GregorianChronology.getInstanceUTC().year(), DateTimeFieldType.yearOfEra());
    }

    private Object readResolve() {
        return INSTANCE;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j10, int i10) {
        return getWrappedField().add(j10, i10);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long add(long j10, long j11) {
        return getWrappedField().add(j10, j11);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long addWrapField(long j10, int i10) {
        return getWrappedField().addWrapField(j10, i10);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int[] addWrapField(ReadablePartial readablePartial, int i10, int[] iArr, int i11) {
        return getWrappedField().addWrapField(readablePartial, i10, iArr, i11);
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int get(long j10) {
        int i10 = getWrappedField().get(j10);
        return i10 < 0 ? -i10 : i10;
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getDifference(long j10, long j11) {
        return getWrappedField().getDifference(j10, j11);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long getDifferenceAsLong(long j10, long j11) {
        return getWrappedField().getDifferenceAsLong(j10, j11);
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMaximumValue() {
        return getWrappedField().getMaximumValue();
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue() {
        return 0;
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getRangeDurationField() {
        return GregorianChronology.getInstanceUTC().eras();
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long remainder(long j10) {
        return getWrappedField().remainder(j10);
    }

    @Override // org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundCeiling(long j10) {
        return getWrappedField().roundCeiling(j10);
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long roundFloor(long j10) {
        return getWrappedField().roundFloor(j10);
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public long set(long j10, int i10) {
        FieldUtils.verifyValueBounds(this, i10, 0, getMaximumValue());
        if (getWrappedField().get(j10) < 0) {
            i10 = -i10;
        }
        return super.set(j10, i10);
    }
}
