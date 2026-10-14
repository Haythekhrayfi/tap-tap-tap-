package org.joda.time.chrono;

import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DurationField;
import org.joda.time.ReadablePartial;
import org.joda.time.field.DecoratedDateTimeField;
import org.joda.time.field.FieldUtils;

/* JADX INFO: loaded from: classes3.dex */
final class GJYearOfEraDateTimeField extends DecoratedDateTimeField {
    private static final long serialVersionUID = -5961050944769862059L;
    private final BasicChronology iChronology;

    public GJYearOfEraDateTimeField(DateTimeField dateTimeField, BasicChronology basicChronology) {
        super(dateTimeField, DateTimeFieldType.yearOfEra());
        this.iChronology = basicChronology;
    }

    private Object readResolve() {
        return this.iChronology.yearOfEra();
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
        return i10 <= 0 ? 1 - i10 : i10;
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
        return 1;
    }

    @Override // org.joda.time.field.DecoratedDateTimeField, org.joda.time.field.BaseDateTimeField, org.joda.time.DateTimeField
    public DurationField getRangeDurationField() {
        return this.iChronology.eras();
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
        FieldUtils.verifyValueBounds(this, i10, 1, getMaximumValue());
        if (this.iChronology.getYear(j10) <= 0) {
            i10 = 1 - i10;
        }
        return super.set(j10, i10);
    }
}
