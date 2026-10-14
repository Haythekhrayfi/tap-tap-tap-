package org.joda.time;

import java.io.Serializable;
import org.joda.convert.FromString;
import org.joda.time.base.AbstractInstant;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.field.FieldUtils;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

/* JADX INFO: loaded from: classes3.dex */
public final class Instant extends AbstractInstant implements Serializable {
    public static final Instant EPOCH = new Instant(0);
    private static final long serialVersionUID = 3299096530934209741L;
    private final long iMillis;

    public Instant() {
        this.iMillis = DateTimeUtils.currentTimeMillis();
    }

    public Instant(long j10) {
        this.iMillis = j10;
    }

    public Instant(Object obj) {
        this.iMillis = ConverterManager.getInstance().getInstantConverter(obj).getInstantMillis(obj, ISOChronology.getInstanceUTC());
    }

    public static Instant now() {
        return new Instant();
    }

    public static Instant ofEpochMilli(long j10) {
        return new Instant(j10);
    }

    public static Instant ofEpochSecond(long j10) {
        return new Instant(FieldUtils.safeMultiply(j10, 1000));
    }

    @FromString
    public static Instant parse(String str) {
        return parse(str, ISODateTimeFormat.dateTimeParser());
    }

    public static Instant parse(String str, DateTimeFormatter dateTimeFormatter) {
        return dateTimeFormatter.parseDateTime(str).toInstant();
    }

    @Override // org.joda.time.ReadableInstant
    public Chronology getChronology() {
        return ISOChronology.getInstanceUTC();
    }

    @Override // org.joda.time.ReadableInstant
    public long getMillis() {
        return this.iMillis;
    }

    public Instant minus(long j10) {
        return withDurationAdded(j10, -1);
    }

    public Instant minus(ReadableDuration readableDuration) {
        return withDurationAdded(readableDuration, -1);
    }

    public Instant plus(long j10) {
        return withDurationAdded(j10, 1);
    }

    public Instant plus(ReadableDuration readableDuration) {
        return withDurationAdded(readableDuration, 1);
    }

    @Override // org.joda.time.base.AbstractInstant, org.joda.time.ReadableDateTime
    public DateTime toDateTime() {
        return new DateTime(getMillis(), ISOChronology.getInstance());
    }

    @Override // org.joda.time.base.AbstractInstant
    @Deprecated
    public DateTime toDateTimeISO() {
        return toDateTime();
    }

    @Override // org.joda.time.base.AbstractInstant, org.joda.time.ReadableInstant
    public Instant toInstant() {
        return this;
    }

    @Override // org.joda.time.base.AbstractInstant
    public MutableDateTime toMutableDateTime() {
        return new MutableDateTime(getMillis(), ISOChronology.getInstance());
    }

    @Override // org.joda.time.base.AbstractInstant
    @Deprecated
    public MutableDateTime toMutableDateTimeISO() {
        return toMutableDateTime();
    }

    public Instant withDurationAdded(long j10, int i10) {
        return (j10 == 0 || i10 == 0) ? this : withMillis(getChronology().add(getMillis(), j10, i10));
    }

    public Instant withDurationAdded(ReadableDuration readableDuration, int i10) {
        return (readableDuration == null || i10 == 0) ? this : withDurationAdded(readableDuration.getMillis(), i10);
    }

    public Instant withMillis(long j10) {
        return j10 == this.iMillis ? this : new Instant(j10);
    }
}
