package q3;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.appcompat.widget.q0;
import g3.u;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class d implements com.bumptech.glide.load.e<Uri, Drawable> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f34772a;

    public d(Context context) {
        this.f34772a = context.getApplicationContext();
    }

    @Override // com.bumptech.glide.load.e
    public /* bridge */ /* synthetic */ u<Drawable> a(Uri uri, int i10, int i11, d3.e eVar) throws IOException {
        return c(uri);
    }

    @Override // com.bumptech.glide.load.e
    public boolean b(Uri uri, d3.e eVar) throws IOException {
        return uri.getScheme().equals("android.resource");
    }

    public u c(Uri uri) {
        Context contextCreatePackageContext;
        int identifier;
        String authority = uri.getAuthority();
        if (authority.equals(this.f34772a.getPackageName())) {
            contextCreatePackageContext = this.f34772a;
        } else {
            try {
                contextCreatePackageContext = this.f34772a.createPackageContext(authority, 0);
            } catch (PackageManager.NameNotFoundException e10) {
                if (!authority.contains(this.f34772a.getPackageName())) {
                    throw new IllegalArgumentException(q0.a("Failed to obtain context or unrecognized Uri format for: ", uri), e10);
                }
                contextCreatePackageContext = this.f34772a;
            }
        }
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri.getPathSegments();
            String authority2 = uri.getAuthority();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            identifier = contextCreatePackageContext.getResources().getIdentifier(str2, str, authority2);
            if (identifier == 0) {
                identifier = Resources.getSystem().getIdentifier(str2, str, "android");
            }
            if (identifier == 0) {
                throw new IllegalArgumentException(q0.a("Failed to find resource id for: ", uri));
            }
        } else {
            if (pathSegments.size() != 1) {
                throw new IllegalArgumentException(q0.a("Unrecognized Uri format: ", uri));
            }
            try {
                identifier = Integer.parseInt(uri.getPathSegments().get(0));
            } catch (NumberFormatException e11) {
                throw new IllegalArgumentException(q0.a("Unrecognized Uri format: ", uri), e11);
            }
        }
        Drawable drawableA = a.a(this.f34772a, contextCreatePackageContext, identifier, null);
        if (drawableA != null) {
            return new c(drawableA);
        }
        return null;
    }
}
