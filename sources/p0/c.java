package p0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f34337a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC0383c f34338a;

        public a(ClipData clipData, int i10) {
            this.f34338a = Build.VERSION.SDK_INT >= 31 ? new b(clipData, i10) : new d(clipData, i10);
        }

        public a(c cVar) {
            this.f34338a = Build.VERSION.SDK_INT >= 31 ? new b(cVar) : new d(cVar);
        }

        public c a() {
            return this.f34338a.build();
        }
    }

    public static final class b implements InterfaceC0383c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentInfo.Builder f34339a;

        public b(ClipData clipData, int i10) {
            this.f34339a = new ContentInfo.Builder(clipData, i10);
        }

        public b(c cVar) {
            this.f34339a = new ContentInfo.Builder(cVar.a());
        }

        @Override // p0.c.InterfaceC0383c
        public void a(Uri uri) {
            this.f34339a.setLinkUri(uri);
        }

        @Override // p0.c.InterfaceC0383c
        public void b(int i10) {
            this.f34339a.setFlags(i10);
        }

        @Override // p0.c.InterfaceC0383c
        public c build() {
            return new c(new e(this.f34339a.build()));
        }

        @Override // p0.c.InterfaceC0383c
        public void setExtras(Bundle bundle) {
            this.f34339a.setExtras(bundle);
        }
    }

    /* JADX INFO: renamed from: p0.c$c, reason: collision with other inner class name */
    public interface InterfaceC0383c {
        void a(Uri uri);

        void b(int i10);

        c build();

        void setExtras(Bundle bundle);
    }

    public static final class d implements InterfaceC0383c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ClipData f34340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f34341b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f34342c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Uri f34343d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Bundle f34344e;

        public d(ClipData clipData, int i10) {
            this.f34340a = clipData;
            this.f34341b = i10;
        }

        public d(c cVar) {
            this.f34340a = cVar.f34337a.c();
            this.f34341b = cVar.f34337a.b();
            this.f34342c = cVar.f34337a.f();
            this.f34343d = cVar.f34337a.a();
            this.f34344e = cVar.f34337a.getExtras();
        }

        @Override // p0.c.InterfaceC0383c
        public void a(Uri uri) {
            this.f34343d = uri;
        }

        @Override // p0.c.InterfaceC0383c
        public void b(int i10) {
            this.f34342c = i10;
        }

        @Override // p0.c.InterfaceC0383c
        public c build() {
            return new c(new g(this));
        }

        @Override // p0.c.InterfaceC0383c
        public void setExtras(Bundle bundle) {
            this.f34344e = bundle;
        }
    }

    public static final class e implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentInfo f34345a;

        public e(ContentInfo contentInfo) {
            Objects.requireNonNull(contentInfo);
            this.f34345a = contentInfo;
        }

        @Override // p0.c.f
        public Uri a() {
            return this.f34345a.getLinkUri();
        }

        @Override // p0.c.f
        public int b() {
            return this.f34345a.getSource();
        }

        @Override // p0.c.f
        public ClipData c() {
            return this.f34345a.getClip();
        }

        @Override // p0.c.f
        public ContentInfo d() {
            return this.f34345a;
        }

        @Override // p0.c.f
        public int f() {
            return this.f34345a.getFlags();
        }

        @Override // p0.c.f
        public Bundle getExtras() {
            return this.f34345a.getExtras();
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("ContentInfoCompat{");
            sbA.append(this.f34345a);
            sbA.append("}");
            return sbA.toString();
        }
    }

    public interface f {
        Uri a();

        int b();

        ClipData c();

        ContentInfo d();

        int f();

        Bundle getExtras();
    }

    public static final class g implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ClipData f34346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f34347b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f34348c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Uri f34349d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Bundle f34350e;

        public g(d dVar) {
            ClipData clipData = dVar.f34340a;
            Objects.requireNonNull(clipData);
            this.f34346a = clipData;
            int i10 = dVar.f34341b;
            if (i10 < 0) {
                throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", "source", 0, 5));
            }
            if (i10 > 5) {
                throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", "source", 0, 5));
            }
            this.f34347b = i10;
            int i11 = dVar.f34342c;
            if ((i11 & 1) == i11) {
                this.f34348c = i11;
                this.f34349d = dVar.f34343d;
                this.f34350e = dVar.f34344e;
            } else {
                StringBuilder sbA = defpackage.a.a("Requested flags 0x");
                sbA.append(Integer.toHexString(i11));
                sbA.append(", but only 0x");
                sbA.append(Integer.toHexString(1));
                sbA.append(" are allowed");
                throw new IllegalArgumentException(sbA.toString());
            }
        }

        @Override // p0.c.f
        public Uri a() {
            return this.f34349d;
        }

        @Override // p0.c.f
        public int b() {
            return this.f34347b;
        }

        @Override // p0.c.f
        public ClipData c() {
            return this.f34346a;
        }

        @Override // p0.c.f
        public ContentInfo d() {
            return null;
        }

        @Override // p0.c.f
        public int f() {
            return this.f34348c;
        }

        @Override // p0.c.f
        public Bundle getExtras() {
            return this.f34350e;
        }

        public String toString() {
            String strValueOf;
            String string;
            StringBuilder sbA = defpackage.a.a("ContentInfoCompat{clip=");
            sbA.append(this.f34346a.getDescription());
            sbA.append(", source=");
            int i10 = this.f34347b;
            if (i10 == 0) {
                strValueOf = "SOURCE_APP";
            } else if (i10 == 1) {
                strValueOf = "SOURCE_CLIPBOARD";
            } else if (i10 == 2) {
                strValueOf = "SOURCE_INPUT_METHOD";
            } else if (i10 == 3) {
                strValueOf = "SOURCE_DRAG_AND_DROP";
            } else if (i10 != 4) {
                strValueOf = i10 != 5 ? String.valueOf(i10) : "SOURCE_PROCESS_TEXT";
            } else {
                strValueOf = "SOURCE_AUTOFILL";
            }
            sbA.append(strValueOf);
            sbA.append(", flags=");
            int i11 = this.f34348c;
            sbA.append((i11 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i11));
            if (this.f34349d == null) {
                string = "";
            } else {
                StringBuilder sbA2 = defpackage.a.a(", hasLinkUri(");
                sbA2.append(this.f34349d.toString().length());
                sbA2.append(")");
                string = sbA2.toString();
            }
            sbA.append(string);
            return androidx.activity.k.a(sbA, this.f34350e != null ? ", hasExtras" : "", "}");
        }
    }

    public c(f fVar) {
        this.f34337a = fVar;
    }

    public ContentInfo a() {
        ContentInfo contentInfoD = this.f34337a.d();
        Objects.requireNonNull(contentInfoD);
        return contentInfoD;
    }

    public String toString() {
        return this.f34337a.toString();
    }
}
