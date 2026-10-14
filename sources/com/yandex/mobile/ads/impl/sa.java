package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.mobile.ads.nativeads.MediaView;
import com.yandex.mobile.ads.nativeads.Rating;

/* JADX INFO: loaded from: classes3.dex */
public final class sa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g20 f25002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ad0 f25003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final lk0 f25004c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final zj0 f25005d;

    public sa(g20 g20Var, ad0 ad0Var, lk0 lk0Var, zj0 zj0Var) {
        fd.j0.i(g20Var, "imageProvider");
        fd.j0.i(ad0Var, "mediaViewAdapterCreator");
        fd.j0.i(lk0Var, "nativeMediaContent");
        fd.j0.i(zj0Var, "nativeForcePauseObserver");
        this.f25002a = g20Var;
        this.f25003b = ad0Var;
        this.f25004c = lk0Var;
        this.f25005d = zj0Var;
    }

    public static ln a(View view) {
        fd.j0.i(view, "view");
        return new ln(new to(view));
    }

    public static ln a(TextView textView) {
        vi viVar = textView != null ? new vi(textView) : null;
        if (viVar != null) {
            return new ln(viVar);
        }
        return null;
    }

    public static ln b(View view) {
        iu0 iu0Var = view instanceof Rating ? new iu0(view) : null;
        if (iu0Var != null) {
            return new ln(iu0Var);
        }
        return null;
    }

    public final ra<?> a(View view, String str) {
        fd.j0.i(str, "type");
        int iHashCode = str.hashCode();
        if (iHashCode != -1034364087) {
            if (iHashCode != -891985903) {
                if (iHashCode == 100313435) {
                    if (!str.equals("image")) {
                        return null;
                    }
                    if ((view instanceof ImageView ? (ImageView) view : null) != null) {
                        return new x10(new r20((ImageView) view, this.f25002a));
                    }
                    return null;
                }
                if (iHashCode != 103772132 || !str.equals("media")) {
                    return null;
                }
                if ((view instanceof MediaView ? (MediaView) view : null) != null) {
                    return a((ImageView) null, (MediaView) view);
                }
                return null;
            }
            if (!str.equals("string")) {
                return null;
            }
        } else if (!str.equals("number")) {
            return null;
        }
        if ((view instanceof TextView ? (TextView) view : null) != null) {
            return new ln(new l61((TextView) view));
        }
        return null;
    }

    public final x10 a(ImageView imageView) {
        wu wuVar = imageView != null ? new wu(imageView, this.f25002a) : null;
        if (wuVar != null) {
            return new x10(wuVar);
        }
        return null;
    }

    public final za0 a(ImageView imageView, MediaView mediaView) {
        r20 r20Var = imageView != null ? new r20(imageView, this.f25002a) : null;
        zc0 zc0VarA = mediaView != null ? this.f25003b.a(mediaView, this.f25002a, this.f25004c, this.f25005d) : null;
        if (r20Var == null && zc0VarA == null) {
            return null;
        }
        return new za0(r20Var, zc0VarA);
    }
}
