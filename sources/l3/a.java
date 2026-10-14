package l3;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import ch.qos.logback.core.joran.action.Action;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class a<Data> implements n<Uri, Data> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AssetManager f32125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0334a<Data> f32126b;

    /* JADX INFO: renamed from: l3.a$a, reason: collision with other inner class name */
    public interface InterfaceC0334a<Data> {
        e3.d<Data> b(AssetManager assetManager, String str);
    }

    public static class b implements o<Uri, ParcelFileDescriptor>, InterfaceC0334a<ParcelFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AssetManager f32127a;

        public b(AssetManager assetManager) {
            this.f32127a = assetManager;
        }

        @Override // l3.o
        public n<Uri, ParcelFileDescriptor> a(r rVar) {
            return new a(this.f32127a, this);
        }

        @Override // l3.a.InterfaceC0334a
        public e3.d<ParcelFileDescriptor> b(AssetManager assetManager, String str) {
            return new e3.h(assetManager, str);
        }
    }

    public static class c implements o<Uri, InputStream>, InterfaceC0334a<InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AssetManager f32128a;

        public c(AssetManager assetManager) {
            this.f32128a = assetManager;
        }

        @Override // l3.o
        public n<Uri, InputStream> a(r rVar) {
            return new a(this.f32128a, this);
        }

        @Override // l3.a.InterfaceC0334a
        public e3.d<InputStream> b(AssetManager assetManager, String str) {
            return new e3.m(assetManager, str);
        }
    }

    public a(AssetManager assetManager, InterfaceC0334a<Data> interfaceC0334a) {
        this.f32125a = assetManager;
        this.f32126b = interfaceC0334a;
    }

    @Override // l3.n
    public boolean a(Uri uri) {
        Uri uri2 = uri;
        return Action.FILE_ATTRIBUTE.equals(uri2.getScheme()) && !uri2.getPathSegments().isEmpty() && "android_asset".equals(uri2.getPathSegments().get(0));
    }

    @Override // l3.n
    public n.a b(Uri uri, int i10, int i11, d3.e eVar) {
        Uri uri2 = uri;
        return new n.a(new a4.c(uri2), this.f32126b.b(this.f32125a, uri2.toString().substring(22)));
    }
}
