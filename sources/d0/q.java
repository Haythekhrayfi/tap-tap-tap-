package d0;

import android.app.Notification;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;

/* JADX INFO: loaded from: classes.dex */
public class q extends x {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public IconCompat f28560e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public IconCompat f28561f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f28562g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f28563h;

    public static class a {
        public static void a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
            bigPictureStyle.bigLargeIcon(bitmap);
        }

        public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
            bigPictureStyle.setSummaryText(charSequence);
        }
    }

    public static class b {
        public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
            bigPictureStyle.bigLargeIcon(icon);
        }
    }

    public static class c {
        public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
            bigPictureStyle.bigPicture(icon);
        }

        public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
            bigPictureStyle.setContentDescription(charSequence);
        }

        public static void c(Notification.BigPictureStyle bigPictureStyle, boolean z10) {
            bigPictureStyle.showBigPictureWhenCollapsed(z10);
        }
    }

    public q() {
    }

    public q(t tVar) {
        i(tVar);
    }

    public static IconCompat j(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        if (parcelable instanceof Icon) {
            return IconCompat.b((Icon) parcelable);
        }
        if (!(parcelable instanceof Bitmap)) {
            return null;
        }
        PorterDuff.Mode mode = IconCompat.f1653k;
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f1655b = (Bitmap) parcelable;
        return iconCompat;
    }

    @Override // d0.x
    public void b(n nVar) {
        int i10 = Build.VERSION.SDK_INT;
        y yVar = (y) nVar;
        Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(yVar.f28622b).setBigContentTitle(this.f28618b);
        IconCompat iconCompat = this.f28560e;
        if (iconCompat != null) {
            if (i10 >= 31) {
                c.a(bigContentTitle, IconCompat.a.f(iconCompat, yVar.f28621a));
            } else if (iconCompat.i() == 1) {
                bigContentTitle = bigContentTitle.bigPicture(this.f28560e.e());
            }
        }
        if (this.f28562g) {
            IconCompat iconCompat2 = this.f28561f;
            if (iconCompat2 == null) {
                a.a(bigContentTitle, null);
            } else {
                b.a(bigContentTitle, IconCompat.a.f(iconCompat2, yVar.f28621a));
            }
        }
        if (this.f28620d) {
            a.b(bigContentTitle, this.f28619c);
        }
        if (i10 >= 31) {
            c.c(bigContentTitle, this.f28563h);
            c.b(bigContentTitle, null);
        }
    }

    @Override // d0.x
    public void c(Bundle bundle) {
        super.c(bundle);
        bundle.remove("android.largeIcon.big");
        bundle.remove("android.picture");
        bundle.remove("android.pictureIcon");
        bundle.remove("android.showBigPictureWhenCollapsed");
    }

    @Override // d0.x
    public String d() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }

    @Override // d0.x
    public void h(Bundle bundle) {
        super.h(bundle);
        if (bundle.containsKey("android.largeIcon.big")) {
            this.f28561f = j(bundle.getParcelable("android.largeIcon.big"));
            this.f28562g = true;
        }
        Parcelable parcelable = bundle.getParcelable("android.picture");
        if (parcelable == null) {
            parcelable = bundle.getParcelable("android.pictureIcon");
        }
        this.f28560e = j(parcelable);
        this.f28563h = bundle.getBoolean("android.showBigPictureWhenCollapsed");
    }

    public q k(Bitmap bitmap) {
        this.f28561f = null;
        this.f28562g = true;
        return this;
    }

    public q l(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            PorterDuff.Mode mode = IconCompat.f1653k;
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.f1655b = bitmap;
            iconCompat = iconCompat2;
        }
        this.f28560e = iconCompat;
        return this;
    }
}
