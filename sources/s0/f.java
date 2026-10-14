package s0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f35394a;

    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InputContentInfo f35395a;

        public a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f35395a = new InputContentInfo(uri, clipDescription, uri2);
        }

        public a(Object obj) {
            this.f35395a = (InputContentInfo) obj;
        }

        @Override // s0.f.c
        public Uri a() {
            return this.f35395a.getLinkUri();
        }

        @Override // s0.f.c
        public Uri b() {
            return this.f35395a.getContentUri();
        }

        @Override // s0.f.c
        public void c() {
            this.f35395a.requestPermission();
        }

        @Override // s0.f.c
        public Object d() {
            return this.f35395a;
        }

        @Override // s0.f.c
        public ClipDescription getDescription() {
            return this.f35395a.getDescription();
        }
    }

    public static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f35396a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ClipDescription f35397b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Uri f35398c;

        public b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f35396a = uri;
            this.f35397b = clipDescription;
            this.f35398c = uri2;
        }

        @Override // s0.f.c
        public Uri a() {
            return this.f35398c;
        }

        @Override // s0.f.c
        public Uri b() {
            return this.f35396a;
        }

        @Override // s0.f.c
        public void c() {
        }

        @Override // s0.f.c
        public Object d() {
            return null;
        }

        @Override // s0.f.c
        public ClipDescription getDescription() {
            return this.f35397b;
        }
    }

    public interface c {
        Uri a();

        Uri b();

        void c();

        Object d();

        ClipDescription getDescription();
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f35394a = Build.VERSION.SDK_INT >= 25 ? new a(uri, clipDescription, uri2) : new b(uri, clipDescription, uri2);
    }

    public f(c cVar) {
        this.f35394a = cVar;
    }
}
