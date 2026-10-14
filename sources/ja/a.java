package ja;

import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.inscode.autoclicker.R;
import fd.j0;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    /* JADX WARN: Code duplicated, block: B:19:0x0054  */
    public static final void a(NativeAd nativeAd, NativeAdView nativeAdView) {
        boolean z10;
        j0.i(nativeAd, "nativeAd");
        View viewFindViewById = nativeAdView.findViewById(R.id.native_ad_title);
        j0.h(viewFindViewById, "nativeAdView.findViewById(R.id.native_ad_title)");
        TextView textView = (TextView) viewFindViewById;
        textView.setText(nativeAd.getHeadline());
        nativeAdView.setHeadlineView(textView);
        View viewFindViewById2 = nativeAdView.findViewById(R.id.native_ad_sponsored_label);
        j0.h(viewFindViewById2, "nativeAdView.findViewByI…ative_ad_sponsored_label)");
        TextView textView2 = (TextView) viewFindViewById2;
        String store = nativeAd.getStore();
        if (store == null) {
            store = "";
        }
        String advertiser = nativeAd.getAdvertiser();
        if (advertiser == null) {
            advertiser = "";
        }
        if (store.length() > 0) {
            z10 = advertiser.length() == 0;
        }
        if (z10) {
            textView2.setText(nativeAd.getStore());
            nativeAdView.setStoreView(textView2);
        } else if (TextUtils.isEmpty(nativeAd.getAdvertiser())) {
            textView2.setText("");
        } else {
            textView2.setText(nativeAd.getAdvertiser());
            nativeAdView.setAdvertiserView(textView2);
        }
        View viewFindViewById3 = nativeAdView.findViewById(R.id.native_ad_body);
        j0.h(viewFindViewById3, "nativeAdView.findViewById(R.id.native_ad_body)");
        TextView textView3 = (TextView) viewFindViewById3;
        textView3.setText(nativeAd.getBody());
        nativeAdView.setBodyView(textView3);
        RatingBar ratingBar = (RatingBar) nativeAdView.findViewById(R.id.rating_bar);
        if (ratingBar != null) {
            Double starRating = nativeAd.getStarRating();
            float fDoubleValue = starRating != null ? (float) starRating.doubleValue() : 0.0f;
            if (fDoubleValue > StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
                ratingBar.setVisibility(0);
                ratingBar.setRating(fDoubleValue);
                nativeAdView.setStarRatingView(ratingBar);
            } else {
                ratingBar.setVisibility(8);
            }
        }
        MediaView mediaView = (MediaView) nativeAdView.findViewById(R.id.native_ad_media);
        if (mediaView != null) {
            nativeAdView.setMediaView(mediaView);
            View viewFindViewById4 = nativeAdView.findViewById(R.id.native_ad_icon);
            j0.h(viewFindViewById4, "nativeAdView.findViewById(R.id.native_ad_icon)");
            ImageView imageView = (ImageView) viewFindViewById4;
            if (nativeAd.getIcon() != null) {
                imageView.setVisibility(0);
                NativeAd.Image icon = nativeAd.getIcon();
                j0.f(icon);
                imageView.setImageDrawable(icon.getDrawable());
                nativeAdView.setIconView(imageView);
            } else {
                imageView.setVisibility(8);
            }
        }
        View viewFindViewById5 = nativeAdView.findViewById(R.id.native_ad_call_to_action);
        j0.h(viewFindViewById5, "nativeAdView.findViewByI…native_ad_call_to_action)");
        Button button = (Button) viewFindViewById5;
        if (nativeAd.getCallToAction() != null) {
            button.setVisibility(0);
            button.setText(nativeAd.getCallToAction());
            nativeAdView.setCallToActionView(button);
        } else {
            button.setVisibility(8);
        }
        nativeAdView.setVisibility(0);
        ((ConstraintLayout) nativeAdView.findViewById(R.id.native_ad_layout)).setVisibility(0);
        ((FrameLayout) nativeAdView.findViewById(R.id.progress_layout)).setVisibility(8);
        nativeAdView.setNativeAd(nativeAd);
    }
}
