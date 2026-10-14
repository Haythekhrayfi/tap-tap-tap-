package i3;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class d implements i3.a.InterfaceC0309a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f31218b;

    public class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f31219a;

        public a(String str) {
            this.f31219a = str;
        }

        @Override // i3.d.c
        public File a() {
            return new File(this.f31219a);
        }
    }

    public class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f31220a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f31221b;

        public b(String str, String str2) {
            this.f31220a = str;
            this.f31221b = str2;
        }

        @Override // i3.d.c
        public File a() {
            return new File(this.f31220a, this.f31221b);
        }
    }

    public interface c {
        File a();
    }

    public d(c cVar, long j10) {
        this.f31217a = j10;
        this.f31218b = cVar;
    }

    public d(String str, long j10) {
        this(new a(str), j10);
    }

    public d(String str, String str2, long j10) {
        this(new b(str, str2), j10);
    }
}
