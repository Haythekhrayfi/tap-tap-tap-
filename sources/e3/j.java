package e3;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class j implements d<InputStream> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final b f29011i = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l3.g f29012c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f29013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f29014e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HttpURLConnection f29015f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InputStream f29016g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f29017h;

    public static class a implements b {
    }

    public interface b {
    }

    public j(l3.g gVar, int i10) {
        b bVar = f29011i;
        this.f29012c = gVar;
        this.f29013d = i10;
        this.f29014e = bVar;
    }

    @Override // e3.d
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // e3.d
    public void b() {
        InputStream inputStream = this.f29016g;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f29015f;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f29015f = null;
    }

    public final InputStream c(URL url, int i10, URL url2, Map<String, String> map) throws IOException {
        if (i10 >= 5) {
            throw new d3.b("Too many (> 5) redirects!");
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new d3.b("In re-direct loop");
                }
            } catch (URISyntaxException unused) {
            }
        }
        Objects.requireNonNull((a) this.f29014e);
        this.f29015f = (HttpURLConnection) url.openConnection();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            this.f29015f.addRequestProperty(entry.getKey(), entry.getValue());
        }
        this.f29015f.setConnectTimeout(this.f29013d);
        this.f29015f.setReadTimeout(this.f29013d);
        this.f29015f.setUseCaches(false);
        this.f29015f.setDoInput(true);
        this.f29015f.setInstanceFollowRedirects(false);
        this.f29015f.connect();
        this.f29016g = this.f29015f.getInputStream();
        if (this.f29017h) {
            return null;
        }
        int responseCode = this.f29015f.getResponseCode();
        int i11 = responseCode / 100;
        if (i11 == 2) {
            HttpURLConnection httpURLConnection = this.f29015f;
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f29016g = new b4.c(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    StringBuilder sbA = defpackage.a.a("Got non empty content encoding: ");
                    sbA.append(httpURLConnection.getContentEncoding());
                    Log.d("HttpUrlFetcher", sbA.toString());
                }
                this.f29016g = httpURLConnection.getInputStream();
            }
            return this.f29016g;
        }
        if (!(i11 == 3)) {
            if (responseCode == -1) {
                throw new d3.b(responseCode);
            }
            throw new d3.b(this.f29015f.getResponseMessage(), responseCode);
        }
        String headerField = this.f29015f.getHeaderField("Location");
        if (TextUtils.isEmpty(headerField)) {
            throw new d3.b("Received empty or null redirect url");
        }
        URL url3 = new URL(url, headerField);
        b();
        return c(url3, i10 + 1, url, map);
    }

    @Override // e3.d
    public void cancel() {
        this.f29017h = true;
    }

    @Override // e3.d
    public com.bumptech.glide.load.a d() {
        return com.bumptech.glide.load.a.REMOTE;
    }

    @Override // e3.d
    public void e(a3.g gVar, d.a<? super InputStream> aVar) {
        StringBuilder sb2;
        int i10 = b4.f.f3299b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        try {
            aVar.f(c(this.f29012c.d(), 0, null, this.f29012c.f32143b.a()));
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                sb2 = new StringBuilder();
                sb2.append("Finished http url fetcher fetch in ");
                sb2.append(b4.f.a(jElapsedRealtimeNanos));
                String string = sb2.toString();
            }
        } catch (IOException e10) {
            if (Log.isLoggable("HttpUrlFetcher", 3)) {
                Log.d("HttpUrlFetcher", "Failed to load data for url", e10);
            }
            aVar.c(e10);
            if (!Log.isLoggable("HttpUrlFetcher", 2)) {
            } else {
                sb2 = new StringBuilder();
            }
        } finally {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                StringBuilder sbA = defpackage.a.a("Finished http url fetcher fetch in ");
                sbA.append(b4.f.a(jElapsedRealtimeNanos));
                Log.v("HttpUrlFetcher", sbA.toString());
            }
        }
    }
}
