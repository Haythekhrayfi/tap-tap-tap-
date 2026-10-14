package g5;

import android.util.Log;
import g5.e.c;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class f implements g5.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Charset f29998d = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f29999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f30000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f30001c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f30002a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f30003b;

        public a(byte[] bArr, int i10) {
            this.f30002a = bArr;
            this.f30003b = i10;
        }
    }

    public f(File file, int i10) {
        this.f29999a = file;
        this.f30000b = i10;
    }

    @Override // g5.a
    public void a() {
        f5.e.a(this.f30001c, "There was a problem closing the Crashlytics log file.");
        this.f30001c = null;
    }

    @Override // g5.a
    public String b() {
        byte[] bArrD = d();
        if (bArrD != null) {
            return new String(bArrD, f29998d);
        }
        return null;
    }

    @Override // g5.a
    public void c(long j10, String str) {
        e();
        if (this.f30001c == null) {
            return;
        }
        if (str == null) {
            str = "null";
        }
        try {
            int i10 = this.f30000b / 4;
            if (str.length() > i10) {
                str = "..." + str.substring(str.length() - i10);
            }
            this.f30001c.b(String.format(Locale.US, "%d %s%n", Long.valueOf(j10), str.replaceAll("\r", " ").replaceAll("\n", " ")).getBytes(f29998d));
            while (!this.f30001c.g() && this.f30001c.m() > this.f30000b) {
                this.f30001c.j();
            }
        } catch (IOException e10) {
            c5.d dVar = c5.d.f3604c;
            if (dVar.a(6)) {
                Log.e(dVar.f3605a, "There was a problem writing to the Crashlytics log.", e10);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    public byte[] d() {
        a aVar;
        if (this.f29999a.exists()) {
            e();
            e eVar = this.f30001c;
            if (eVar == null) {
                aVar = null;
            } else {
                int[] iArr = {0};
                byte[] bArr = new byte[eVar.m()];
                try {
                    e eVar2 = this.f30001c;
                    synchronized (eVar2) {
                        try {
                            int iN = eVar2.f29989f.f29993a;
                            for (int i10 = 0; i10 < eVar2.f29988e; i10++) {
                                e.b bVarH = eVar2.h(iN);
                                e.c cVar = eVar2.new c(bVarH, null);
                                int i11 = bVarH.f29994b;
                                try {
                                    cVar.read(bArr, iArr[0], i11);
                                    iArr[0] = iArr[0] + i11;
                                    cVar.close();
                                    iN = eVar2.n(bVarH.f29993a + 4 + bVarH.f29994b);
                                } catch (Throwable th) {
                                    cVar.close();
                                    throw th;
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } catch (IOException e10) {
                    c5.d dVar = c5.d.f3604c;
                    if (dVar.a(6)) {
                        Log.e(dVar.f3605a, "A problem occurred while reading the Crashlytics log file.", e10);
                    }
                }
                aVar = new a(bArr, iArr[0]);
            }
        } else {
            aVar = null;
        }
        if (aVar == null) {
            return null;
        }
        int i12 = aVar.f30003b;
        byte[] bArr2 = new byte[i12];
        System.arraycopy(aVar.f30002a, 0, bArr2, 0, i12);
        return bArr2;
    }

    public final void e() {
        if (this.f30001c == null) {
            try {
                this.f30001c = new e(this.f29999a);
            } catch (IOException e10) {
                c5.d dVar = c5.d.f3604c;
                StringBuilder sbA = defpackage.a.a("Could not open log file: ");
                sbA.append(this.f29999a);
                dVar.d(sbA.toString(), e10);
            }
        }
    }
}
