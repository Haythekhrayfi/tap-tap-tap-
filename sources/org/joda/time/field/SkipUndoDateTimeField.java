package org.joda.time.field;

import org.joda.time.Chronology;
import org.joda.time.DateTimeField;

/* JADX INFO: loaded from: classes3.dex */
public final class SkipUndoDateTimeField extends DelegatedDateTimeField {
    private static final long serialVersionUID = -5875876968979L;
    private final Chronology iChronology;
    private transient int iMinValue;
    private final int iSkip;

    public SkipUndoDateTimeField(Chronology chronology, DateTimeField dateTimeField) {
        this(chronology, dateTimeField, 0);
    }

    public SkipUndoDateTimeField(Chronology chronology, DateTimeField dateTimeField, int i10) {
        super(dateTimeField);
        this.iChronology = chronology;
        int minimumValue = super.getMinimumValue();
        if (minimumValue >= i10) {
            if (minimumValue == i10 + 1) {
                this.iMinValue = i10;
            }
            this.iSkip = i10;
        }
        minimumValue++;
        this.iMinValue = minimumValue;
        this.iSkip = i10;
    }

    private Object readResolve() {
        return getType().getField(this.iChronology);
    }

    @Override // org.joda.time.field.DelegatedDateTimeField, org.joda.time.DateTimeField
    public int get(long j10) {
        int i10 = super.get(j10);
        return i10 < this.iSkip ? i10 + 1 : i10;
    }

    @Override // org.joda.time.field.DelegatedDateTimeField, org.joda.time.DateTimeField
    public int getMinimumValue() {
        return this.iMinValue;
    }

    @Override // org.joda.time.field.DelegatedDateTimeField, org.joda.time.DateTimeField
    public long set(long j10, int i10) {
        FieldUtils.verifyValueBounds(this, i10, this.iMinValue, getMaximumValue());
        if (i10 <= this.iSkip) {
            i10--;
        }
        return super.set(j10, i10);
    }
}
