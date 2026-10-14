package a9;

import ch.qos.logback.core.CoreConstants;
import com.google.android.material.datepicker.UtcDates;
import ed.u;
import fd.j0;
import java.util.Calendar;
import java.util.Objects;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import jc.e;
import jc.f;
import org.joda.time.DateTimeConstants;
import vc.g;
import vc.l;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements Comparable<b> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f203g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final SimpleTimeZone f204h = new SimpleTimeZone(0, UtcDates.UTC);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeZone f206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e f207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f208f;

    public static final class a {
        public a() {
        }

        public a(g gVar) {
        }
    }

    /* JADX INFO: renamed from: a9.b$b, reason: collision with other inner class name */
    public static final class C0008b extends l implements uc.a<Calendar> {
        public C0008b() {
            super(0);
        }

        @Override // uc.a
        public Calendar invoke() {
            Calendar calendar = Calendar.getInstance(b.f204h);
            calendar.setTimeInMillis(b.this.f205c);
            return calendar;
        }
    }

    public b(long j10, TimeZone timeZone) {
        j0.i(timeZone, "timezone");
        this.f205c = j10;
        this.f206d = timeZone;
        this.f207e = f.a(kotlin.a.NONE, new C0008b());
        this.f208f = j10 - ((long) ((timeZone.getRawOffset() / 60) * DateTimeConstants.MILLIS_PER_MINUTE));
    }

    @Override // java.lang.Comparable
    public int compareTo(b bVar) {
        b bVar2 = bVar;
        j0.i(bVar2, "other");
        long j10 = this.f208f;
        long j11 = bVar2.f208f;
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f208f == ((b) obj).f208f;
    }

    public int hashCode() {
        return Long.hashCode(this.f208f);
    }

    public String toString() {
        a aVar = f203g;
        Calendar calendar = (Calendar) this.f207e.getValue();
        j0.h(calendar, "calendar");
        Objects.requireNonNull(aVar);
        j0.i(calendar, "c");
        return String.valueOf(calendar.get(1)) + CoreConstants.DASH_CHAR + u.J(String.valueOf(calendar.get(2) + 1), 2, '0') + CoreConstants.DASH_CHAR + u.J(String.valueOf(calendar.get(5)), 2, '0') + ' ' + u.J(String.valueOf(calendar.get(11)), 2, '0') + CoreConstants.COLON_CHAR + u.J(String.valueOf(calendar.get(12)), 2, '0') + CoreConstants.COLON_CHAR + u.J(String.valueOf(calendar.get(13)), 2, '0');
    }
}
