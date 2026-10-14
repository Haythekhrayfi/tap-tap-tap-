package re;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public enum b implements l {
    NANOS("Nanos", ne.d.b(1)),
    MICROS("Micros", ne.d.b(1000)),
    MILLIS("Millis", ne.d.b(1000000)),
    SECONDS("Seconds", ne.d.c(1)),
    MINUTES("Minutes", ne.d.c(60)),
    HOURS("Hours", ne.d.c(3600)),
    HALF_DAYS("HalfDays", ne.d.c(43200)),
    DAYS("Days", ne.d.c(86400)),
    WEEKS("Weeks", ne.d.c(604800)),
    MONTHS("Months", ne.d.c(2629746)),
    YEARS("Years", ne.d.c(31556952)),
    DECADES("Decades", ne.d.c(315569520)),
    CENTURIES("Centuries", ne.d.c(3155695200L)),
    MILLENNIA("Millennia", ne.d.c(31556952000L)),
    ERAS("Eras", ne.d.c(31556952000000000L)),
    FOREVER("Forever", ne.d.d(RecyclerView.FOREVER_NS, 999999999));

    private final ne.d duration;
    private final String name;

    b(String str, ne.d dVar) {
        this.name = str;
        this.duration = dVar;
    }

    @Override // re.l
    public <R extends d> R addTo(R r10, long j10) {
        return (R) r10.j(j10, this);
    }

    @Override // re.l
    public long between(d dVar, d dVar2) {
        return dVar.d(dVar2, this);
    }

    public ne.d getDuration() {
        return this.duration;
    }

    @Override // re.l
    public boolean isDateBased() {
        return compareTo(DAYS) >= 0 && this != FOREVER;
    }

    public boolean isDurationEstimated() {
        return isDateBased() || this == FOREVER;
    }

    public boolean isSupportedBy(d dVar) {
        if (this == FOREVER) {
            return false;
        }
        if (dVar instanceof oe.b) {
            return isDateBased();
        }
        if ((dVar instanceof oe.c) || (dVar instanceof oe.f)) {
            return true;
        }
        try {
            dVar.j(1L, this);
            return true;
        } catch (RuntimeException unused) {
            try {
                dVar.j(-1L, this);
                return true;
            } catch (RuntimeException unused2) {
                return false;
            }
        }
    }

    public boolean isTimeBased() {
        return compareTo(DAYS) < 0;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.name;
    }
}
