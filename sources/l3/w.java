package l3;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import ch.qos.logback.core.joran.action.Action;
import com.applovin.sdk.AppLovinEventTypes;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class w<Data> implements n<Uri, Data> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set<String> f32202b = Collections.unmodifiableSet(new HashSet(Arrays.asList(Action.FILE_ATTRIBUTE, "android.resource", AppLovinEventTypes.USER_VIEWED_CONTENT)));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c<Data> f32203a;

    public static final class a implements o<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentResolver f32204a;

        public a(ContentResolver contentResolver) {
            this.f32204a = contentResolver;
        }

        @Override // l3.o
        public n<Uri, AssetFileDescriptor> a(r rVar) {
            return new w(this);
        }

        @Override // l3.w.c
        public e3.d<AssetFileDescriptor> b(Uri uri) {
            return new e3.a(this.f32204a, uri);
        }
    }

    public static class b implements o<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentResolver f32205a;

        public b(ContentResolver contentResolver) {
            this.f32205a = contentResolver;
        }

        @Override // l3.o
        public n<Uri, ParcelFileDescriptor> a(r rVar) {
            return new w(this);
        }

        @Override // l3.w.c
        public e3.d<ParcelFileDescriptor> b(Uri uri) {
            return new e3.i(this.f32205a, uri);
        }
    }

    public interface c<Data> {
        e3.d<Data> b(Uri uri);
    }

    public static class d implements o<Uri, InputStream>, c<InputStream> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContentResolver f32206a;

        public d(ContentResolver contentResolver) {
            this.f32206a = contentResolver;
        }

        @Override // l3.o
        public n<Uri, InputStream> a(r rVar) {
            return new w(this);
        }

        @Override // l3.w.c
        public e3.d<InputStream> b(Uri uri) {
            return new e3.n(this.f32206a, uri);
        }
    }

    public w(c<Data> cVar) {
        this.f32203a = cVar;
    }

    @Override // l3.n
    public boolean a(Uri uri) {
        return f32202b.contains(uri.getScheme());
    }

    @Override // l3.n
    public n.a b(Uri uri, int i10, int i11, d3.e eVar) {
        Uri uri2 = uri;
        return new n.a(new a4.c(uri2), this.f32203a.b(uri2));
    }
}
