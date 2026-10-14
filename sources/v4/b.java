package v4;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f36669g = {"experimentId", "experimentStartTime", "timeToLiveMillis", "triggerTimeoutMillis", "variantId"};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final DateFormat f36670h = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f36673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Date f36674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f36675e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f36676f;

    public b(String str, String str2, String str3, Date date, long j10, long j11) {
        this.f36671a = str;
        this.f36672b = str2;
        this.f36673c = str3;
        this.f36674d = date;
        this.f36675e = j10;
        this.f36676f = j11;
    }
}
