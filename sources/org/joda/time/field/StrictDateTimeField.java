package org.joda.time.field;

import org.joda.time.DateTimeField;

/* JADX INFO: loaded from: classes3.dex */
public class StrictDateTimeField extends DelegatedDateTimeField {
    private static final long serialVersionUID = 3154803964207950910L;

    public StrictDateTimeField(DateTimeField dateTimeField) {
        super(dateTimeField);
    }

    public static DateTimeField getInstance(DateTimeField dateTimeField) {
        if (dateTimeField == null) {
            return null;
        }
        if (dateTimeField instanceof LenientDateTimeField) {
            dateTimeField = ((LenientDateTimeField) dateTimeField).getWrappedField();
        }
        return !dateTimeField.isLenient() ? dateTimeField : new StrictDateTimeField(dateTimeField);
    }

    @Override // org.joda.time.field.DelegatedDateTimeField, org.joda.time.DateTimeField
    public final boolean isLenient() {
        return false;
    }

    @Override // org.joda.time.field.DelegatedDateTimeField, org.joda.time.DateTimeField
    public long set(long j10, int i10) {
        FieldUtils.verifyValueBounds(this, i10, getMinimumValue(j10), getMaximumValue(j10));
        return super.set(j10, i10);
    }
}
