package org.joda.time.base;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import org.joda.time.Chronology;
import org.joda.time.DateTimeUtils;
import org.joda.time.DateTimeZone;
import org.joda.time.chrono.ISOChronology;
import org.joda.time.convert.ConverterManager;
import org.joda.time.convert.InstantConverter;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseDateTime extends AbstractDateTime implements Serializable {
    private static final long serialVersionUID = -6728882245981L;
    private volatile Chronology iChronology;
    private volatile long iMillis;

    public BaseDateTime() {
        this(DateTimeUtils.currentTimeMillis(), ISOChronology.getInstance());
    }

    public BaseDateTime(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this(i10, i11, i12, i13, i14, i15, i16, ISOChronology.getInstance());
    }

    public BaseDateTime(int i10, int i11, int i12, int i13, int i14, int i15, int i16, Chronology chronology) {
        this.iChronology = checkChronology(chronology);
        this.iMillis = checkInstant(this.iChronology.getDateTimeMillis(i10, i11, i12, i13, i14, i15, i16), this.iChronology);
        adjustForMinMax();
    }

    public BaseDateTime(int i10, int i11, int i12, int i13, int i14, int i15, int i16, DateTimeZone dateTimeZone) {
        this(i10, i11, i12, i13, i14, i15, i16, ISOChronology.getInstance(dateTimeZone));
    }

    public BaseDateTime(long j10) {
        this(j10, ISOChronology.getInstance());
    }

    public BaseDateTime(long j10, Chronology chronology) {
        this.iChronology = checkChronology(chronology);
        this.iMillis = checkInstant(j10, this.iChronology);
        adjustForMinMax();
    }

    public BaseDateTime(long j10, DateTimeZone dateTimeZone) {
        this(j10, ISOChronology.getInstance(dateTimeZone));
    }

    public BaseDateTime(Object obj, Chronology chronology) {
        InstantConverter instantConverter = ConverterManager.getInstance().getInstantConverter(obj);
        this.iChronology = checkChronology(instantConverter.getChronology(obj, chronology));
        this.iMillis = checkInstant(instantConverter.getInstantMillis(obj, chronology), this.iChronology);
        adjustForMinMax();
    }

    public BaseDateTime(Object obj, DateTimeZone dateTimeZone) {
        InstantConverter instantConverter = ConverterManager.getInstance().getInstantConverter(obj);
        Chronology chronologyCheckChronology = checkChronology(instantConverter.getChronology(obj, dateTimeZone));
        this.iChronology = chronologyCheckChronology;
        this.iMillis = checkInstant(instantConverter.getInstantMillis(obj, chronologyCheckChronology), chronologyCheckChronology);
        adjustForMinMax();
    }

    public BaseDateTime(Chronology chronology) {
        this(DateTimeUtils.currentTimeMillis(), chronology);
    }

    public BaseDateTime(DateTimeZone dateTimeZone) {
        this(DateTimeUtils.currentTimeMillis(), ISOChronology.getInstance(dateTimeZone));
    }

    private void adjustForMinMax() {
        if (this.iMillis == Long.MIN_VALUE || this.iMillis == RecyclerView.FOREVER_NS) {
            this.iChronology = this.iChronology.withUTC();
        }
    }

    public Chronology checkChronology(Chronology chronology) {
        return DateTimeUtils.getChronology(chronology);
    }

    public long checkInstant(long j10, Chronology chronology) {
        return j10;
    }

    @Override // org.joda.time.ReadableInstant
    public Chronology getChronology() {
        return this.iChronology;
    }

    @Override // org.joda.time.ReadableInstant
    public long getMillis() {
        return this.iMillis;
    }

    public void setChronology(Chronology chronology) {
        this.iChronology = checkChronology(chronology);
    }

    public void setMillis(long j10) {
        this.iMillis = checkInstant(j10, this.iChronology);
    }
}
