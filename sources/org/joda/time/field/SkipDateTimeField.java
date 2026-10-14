package org.joda.time.field;

import org.joda.time.Chronology;
import org.joda.time.DateTimeField;
import org.joda.time.DateTimeFieldType;
import org.joda.time.IllegalFieldValueException;

/* JADX INFO: loaded from: classes3.dex */
public final class SkipDateTimeField extends DelegatedDateTimeField {
    private static final long serialVersionUID = -8869148464118507846L;
    private final Chronology iChronology;
    private transient int iMinValue;
    private final int iSkip;

    public SkipDateTimeField(Chronology chronology, DateTimeField dateTimeField) {
        this(chronology, dateTimeField, 0);
    }

    public SkipDateTimeField(Chronology chronology, DateTimeField dateTimeField, int i10) {
        super(dateTimeField);
        this.iChronology = chronology;
        int minimumValue = super.getMinimumValue();
        if (minimumValue < i10) {
            minimumValue--;
        } else if (minimumValue == i10) {
            minimumValue = i10 + 1;
        }
        this.iMinValue = minimumValue;
        this.iSkip = i10;
    }

    private Object readResolve() {
        return getType().getField(this.iChronology);
    }

    @Override // org.joda.time.field.DelegatedDateTimeField, org.joda.time.DateTimeField
    public int get(long j10) {
        int i10 = super.get(j10);
        return i10 <= this.iSkip ? i10 - 1 : i10;
    }

    @Override // org.joda.time.field.DelegatedDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue() {
        return this.iMinValue;
    }

    @Override // org.joda.time.field.DelegatedDateTimeField, org.joda.time.DateTimeField
    public long set(long j10, int i10) {
        FieldUtils.verifyValueBounds(this, i10, this.iMinValue, getMaximumValue());
        int i11 = this.iSkip;
        if (i10 <= i11) {
            if (i10 == i11) {
                throw new IllegalFieldValueException(DateTimeFieldType.year(), Integer.valueOf(i10), (Number) null, (Number) null);
            }
            i10++;
        }
        return super.set(j10, i10);
    }
}
