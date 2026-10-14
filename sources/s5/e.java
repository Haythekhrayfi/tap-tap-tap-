package s5;

import com.google.android.material.datepicker.UtcDates;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import q5.g;
import q5.h;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements r5.b<e> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f35461e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, q5.e<?>> f35462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<Class<?>, g<?>> f35463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public q5.e<Object> f35464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f35465d;

    public static final class a implements g<Date> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DateFormat f35466a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            f35466a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(UtcDates.UTC));
        }

        public a(d dVar) {
        }

        @Override // q5.b
        public void encode(Object obj, h hVar) throws IOException {
            hVar.e(f35466a.format((Date) obj));
        }
    }

    public e() {
        HashMap map = new HashMap();
        this.f35462a = map;
        HashMap map2 = new HashMap();
        this.f35463b = map2;
        this.f35464c = s5.a.f35455b;
        this.f35465d = false;
        map2.put(String.class, new g() { // from class: s5.b
            @Override // q5.b
            public final void encode(Object obj, h hVar) throws IOException {
                e.a aVar = e.f35461e;
                hVar.e((String) obj);
            }
        });
        map.remove(String.class);
        map2.put(Boolean.class, new g() { // from class: s5.c
            @Override // q5.b
            public final void encode(Object obj, h hVar) throws IOException {
                e.a aVar = e.f35461e;
                hVar.f(((Boolean) obj).booleanValue());
            }
        });
        map.remove(Boolean.class);
        map2.put(Date.class, f35461e);
        map.remove(Date.class);
    }

    @Override // r5.b
    public r5.b a(Class cls, q5.e eVar) {
        this.f35462a.put(cls, eVar);
        this.f35463b.remove(cls);
        return this;
    }
}
