package j5;

import c5.d;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<String, String> f31709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, String> f31710c = new HashMap();

    public a(String str, Map<String, String> map) {
        this.f31708a = str;
        this.f31709b = map;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0053  */
    /* JADX WARN: Code duplicated, block: B:27:0x0063 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0038  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0063 -> B:5:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.String a(java.lang.String r8, java.util.Map<java.lang.String, java.lang.String> r9) throws java.io.UnsupportedEncodingException {
        /*
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
            java.lang.Object r1 = r9.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            java.lang.String r2 = "="
            r0.append(r2)
            java.lang.Object r3 = r1.getValue()
            java.lang.String r4 = "UTF-8"
            java.lang.String r5 = ""
            if (r3 == 0) goto L2c
            goto L55
        L2c:
            r1 = r5
        L2d:
            r0.append(r5)
            boolean r3 = r9.hasNext()
            java.lang.String r5 = "&"
            if (r3 == 0) goto L65
            java.lang.Object r3 = r9.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            r0.append(r5)
            java.lang.Object r5 = r3.getKey()
            java.lang.String r5 = (java.lang.String) r5
            r0.append(r5)
            r0.append(r2)
            java.lang.Object r5 = r3.getValue()
            if (r5 == 0) goto L63
            r5 = r1
            r1 = r3
        L55:
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = java.net.URLEncoder.encode(r1, r4)
            r6 = r5
            r5 = r1
            r1 = r6
            goto L2d
        L63:
            r5 = r1
            goto L2c
        L65:
            java.lang.String r9 = r0.toString()
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L70
            return r8
        L70:
            java.lang.String r0 = "?"
            boolean r1 = r8.contains(r0)
            if (r1 == 0) goto L87
            boolean r0 = r8.endsWith(r5)
            if (r0 != 0) goto L82
            java.lang.String r9 = i.f.a(r5, r9)
        L82:
            java.lang.String r8 = i.f.a(r8, r9)
            return r8
        L87:
            java.lang.String r8 = androidx.activity.j.a(r8, r0, r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: j5.a.a(java.lang.String, java.util.Map):java.lang.String");
    }

    public c b() throws Throwable {
        HttpsURLConnection httpsURLConnection;
        InputStream inputStream = null;
        String string = null;
        inputStream = null;
        try {
            String strA = a(this.f31708a, this.f31709b);
            d.f3604c.e("GET Request URL: " + strA);
            httpsURLConnection = (HttpsURLConnection) new URL(strA).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod("GET");
                for (Map.Entry<String, String> entry : this.f31710c.entrySet()) {
                    httpsURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream2, "UTF-8"));
                        char[] cArr = new char[8192];
                        StringBuilder sb2 = new StringBuilder();
                        while (true) {
                            int i10 = bufferedReader.read(cArr);
                            if (i10 == -1) {
                                break;
                            }
                            sb2.append(cArr, 0, i10);
                        }
                        string = sb2.toString();
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new c(responseCode, string);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            httpsURLConnection = null;
        }
    }
}
