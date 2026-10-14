package com.facebook.ads.internal.dynamicloading;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdScrollView;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.NativeAdViewAttributes;
import com.facebook.ads.NativeAdsManager;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.NativeBannerAdView;
import com.facebook.ads.RewardedInterstitialAd;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.internal.api.AdCompanionViewApi;
import com.facebook.ads.internal.api.AdOptionsViewApi;
import com.facebook.ads.internal.api.AdSettingsApi;
import com.facebook.ads.internal.api.AdSizeApi;
import com.facebook.ads.internal.api.AdViewApi;
import com.facebook.ads.internal.api.AdViewParentApi;
import com.facebook.ads.internal.api.AudienceNetworkActivityApi;
import com.facebook.ads.internal.api.AudienceNetworkAdsApi;
import com.facebook.ads.internal.api.BidderTokenProviderApi;
import com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi;
import com.facebook.ads.internal.api.InitApi;
import com.facebook.ads.internal.api.InterstitialAdApi;
import com.facebook.ads.internal.api.MediaViewApi;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.NativeAdImageApi;
import com.facebook.ads.internal.api.NativeAdLayoutApi;
import com.facebook.ads.internal.api.NativeAdScrollViewApi;
import com.facebook.ads.internal.api.NativeAdViewApi;
import com.facebook.ads.internal.api.NativeAdViewAttributesApi;
import com.facebook.ads.internal.api.NativeAdViewTypeApi;
import com.facebook.ads.internal.api.NativeAdsManagerApi;
import com.facebook.ads.internal.api.NativeBannerAdApi;
import com.facebook.ads.internal.api.NativeBannerAdViewApi;
import com.facebook.ads.internal.api.NativeComponentTagApi;
import com.facebook.ads.internal.api.RewardedInterstitialAdApi;
import com.facebook.ads.internal.api.RewardedVideoAdApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoader;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.settings.AdInternalSettings;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;
import com.facebook.ads.redexgen.X.AnonymousClass58;
import com.facebook.ads.redexgen.X.C06355f;
import com.facebook.ads.redexgen.X.C06395j;
import com.facebook.ads.redexgen.X.C0984Kb;
import com.facebook.ads.redexgen.X.C1347Yg;
import com.facebook.ads.redexgen.X.C1348Yh;
import com.facebook.ads.redexgen.X.C5B;
import com.facebook.ads.redexgen.X.C5H;
import com.facebook.ads.redexgen.X.C5N;
import com.facebook.ads.redexgen.X.C5O;
import com.facebook.ads.redexgen.X.C5Q;
import com.facebook.ads.redexgen.X.C5T;
import com.facebook.ads.redexgen.X.C5U;
import com.facebook.ads.redexgen.X.C5V;
import com.facebook.ads.redexgen.X.C5Y;
import com.facebook.ads.redexgen.X.C8J;
import com.facebook.ads.redexgen.X.J0;
import com.facebook.ads.redexgen.X.J1;
import com.facebook.ads.redexgen.X.J2;
import com.facebook.ads.redexgen.X.J3;
import com.facebook.ads.redexgen.X.JE;
import com.facebook.ads.redexgen.X.JG;
import com.facebook.ads.redexgen.X.U7;
import com.facebook.ads.redexgen.X.UJ;
import com.facebook.ads.redexgen.X.YP;
import com.facebook.ads.redexgen.X.YQ;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class DynamicLoaderImpl implements DynamicLoader {
    public static AdSettingsApi A00;
    public static AudienceNetworkAdsApi A01;
    public static NativeAdViewApi A02;
    public static NativeBannerAdViewApi A03;
    public static C5N A04;
    public static String[] A05 = {"", "hl0DpOFqxM1jfK98LJTADvCdgffrETQN", "QW5nZBv4w8ebawOaJAju5UC6DpXIEYNP", "lDXIr49IIqC5d9soZ9ZlhOdK7Sq4PNcS", "1TLrXBQAGAxZIydv1bacR9cCDSxOiDhT", "HKpyy44hPf1TiYKwXHdFJYATCyhvdc4i", "5Vop4gtsdytJgHep4xjnsMChzM034SFi", "0HGMkPnlBdCz3NKZQL2lJn"};
    public static final InitApi A06 = new InitApi() { // from class: com.facebook.ads.redexgen.X.5P
        @Override // com.facebook.ads.internal.api.InitApi
        public final void initialize(Context context, MultithreadedBundleWrapper multithreadedBundleWrapper, AudienceNetworkAds.InitListener initListener, int i10) {
            C8J.A0G(C5O.A07(context), multithreadedBundleWrapper, initListener, i10);
        }

        @Override // com.facebook.ads.internal.api.InitApi
        public final boolean isInitialized() {
            return C8J.A0H();
        }

        @Override // com.facebook.ads.internal.api.InitApi
        public final void onAdLoadInvoked(Context context) {
            C8J.A08(C5O.A07(context));
        }

        @Override // com.facebook.ads.internal.api.InitApi
        public final void onContentProviderCreated(Context context) {
            C8J.A09(C5O.A07(context));
        }
    };

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AdCompanionViewApi createAdCompanionViewApi() {
        return new C1348Yh();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AdOptionsViewApi createAdOptionsView(Context context, NativeAdBase nativeAdBase, NativeAdLayout nativeAdLayout, AdOptionsView.Orientation orientation, int i10, AdOptionsView adOptionsView) {
        return new C1347Yg(context, nativeAdBase, nativeAdLayout, orientation, i10, adOptionsView);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AdOptionsViewApi createAdOptionsView(Context context, NativeAdBase nativeAdBase, NativeAdLayout nativeAdLayout, AdOptionsView adOptionsView) {
        return new C1347Yg(context, nativeAdBase, nativeAdLayout, adOptionsView);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AdSettingsApi createAdSettingsApi() {
        if (A00 == null) {
            A00 = new AdSettingsApi() { // from class: com.facebook.ads.redexgen.X.5A
                public static byte[] A00;
                public static String[] A01 = {"TFkOB7WAPr6F4oSDAD2lBM3orjMmpCql", "qm70b4Ur0FRBuwfAT3tN36vqG0Nf4UFd", "zPpQ1cnfbXvczPvVr", "8IvLkkrNdMNEKNCoxjkf6IUs19Br2Jri", "GW45NL8mXfcvSmeq7", "yk6fztNbTNbTdYOeWP4a4qU6KiJuVBGT", "Yi7aT5eKgI7tScmdPed7vydq7f2NoqCT", "ldtlhzHQs0POAzCz5K2SoOIZIeNjlq2l"};
                public static final String A02;
                public static final Collection<String> A03;
                public static volatile boolean A04;

                public static String A00(int i10, int i11, int i12) {
                    byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
                    for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
                        bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 48);
                    }
                    return new String(bArrCopyOfRange);
                }

                public static void A01() {
                    A00 = new byte[]{124, 119, 101, 8, 15, 9, 4, Ascii.US, Ascii.RS, 13, 18, Ascii.CAN, Ascii.RS, 4, 18, Ascii.US, 4, 19, Ascii.SUB, 8, 19, 4, 16, Ascii.RS, 2, 107, 90, 76, 75, Ascii.US, 82, 80, 91, 90, Ascii.US, 91, 90, 73, 86, 92, 90, Ascii.US, 87, 94, 76, 87, 5, Ascii.US, 45, 18, Ascii.US, 20, 90, 14, Ascii.US, 9, 14, 19, 20, Ascii.GS, 90, 3, 21, 15, 8, 90, Ascii.ESC, 10, 10, 90, 13, 19, 14, 18, 90, 60, Ascii.ESC, Ascii.EM, Ascii.US, Ascii.CAN, 21, 21, 17, 93, 9, 90, Ascii.ESC, Ascii.RS, 90, 15, 20, 19, 14, 9, 90, 3, 21, 15, 90, 23, 15, 9, 14, 90, 9, 10, Ascii.US, Ascii.EM, 19, Ascii.FS, 3, 90, 14, 18, Ascii.US, 90, Ascii.RS, Ascii.US, 12, 19, Ascii.EM, Ascii.US, 90, 18, Ascii.ESC, 9, 18, Ascii.US, Ascii.RS, 90, 51, 62, 90, 14, 21, 90, Ascii.US, 20, 9, 15, 8, Ascii.US, 90, 14, 18, Ascii.US, 90, Ascii.RS, Ascii.US, 22, 19, 12, Ascii.US, 8, 3, 90, 21, Ascii.FS, 90, 14, Ascii.US, 9, 14, 90, Ascii.ESC, Ascii.RS, 9, 86, 90, Ascii.ESC, Ascii.RS, Ascii.RS, 90, 14, 18, Ascii.US, 90, Ascii.FS, 21, 22, 22, 21, 13, 19, 20, Ascii.GS, 90, Ascii.EM, 21, Ascii.RS, Ascii.US, 90, Ascii.CAN, Ascii.US, Ascii.FS, 21, 8, Ascii.US, 90, 22, 21, Ascii.ESC, Ascii.RS, 19, 20, Ascii.GS, 90, Ascii.ESC, 20, 90, Ascii.ESC, Ascii.RS, 64, 90, 59, Ascii.RS, 41, Ascii.US, 14, 14, 19, 20, Ascii.GS, 9, 84, Ascii.ESC, Ascii.RS, Ascii.RS, 46, Ascii.US, 9, 14, 62, Ascii.US, 12, 19, Ascii.EM, Ascii.US, 82, 88, Ascii.SUB, Ascii.ESC, 8, 23, Ascii.GS, Ascii.ESC, 55, Ascii.SUB, 54, Ascii.US, 13, 22, 60, 52, 52, 60, 55, 62, 4, 40, 63, 48, 114, 101, 106, 102, 114, Ascii.DEL, 104, 40, 38, 96, 41, 61, 48, 39, 103, 105, 43, 47};
                }

                static {
                    A01();
                    A02 = AdInternalSettings.class.getSimpleName();
                    HashSet hashSet = new HashSet();
                    A03 = hashSet;
                    hashSet.add(A00(262, 3, 49));
                    hashSet.add(A00(252, 10, 107));
                    hashSet.add(A00(265, 7, 32));
                    hashSet.add(A00(272, 8, 111));
                    A04 = false;
                }

                public static void A02(String str) {
                    if (A04) {
                        return;
                    }
                    A04 = true;
                    String str2 = A02;
                    Log.i(str2, A00(25, 23, 15) + str);
                    Log.i(str2, A00(48, 192, 74) + str + A00(0, 3, 110));
                }

                @Override // com.facebook.ads.internal.api.AdSettingsApi
                public final boolean isTestMode(Context context) {
                    if (AdInternalSettings.isDebugBuild() || AdInternalSettings.isExplicitTestMode() || A03.contains(Build.PRODUCT)) {
                        return true;
                    }
                    MultithreadedBundleWrapper multithreadedBundleWrapper = AdInternalSettings.sSettingsBundle;
                    String strA00 = A00(3, 22, 107);
                    String string = multithreadedBundleWrapper.getString(strA00, null);
                    if (string == null) {
                        SharedPreferences sharedPreferencesA00 = C0972Jp.A00(context);
                        String strA01 = A00(240, 12, 78);
                        string = sharedPreferencesA00.getString(strA01, null);
                        if (TextUtils.isEmpty(string)) {
                            UUID uuidRandomUUID = UUID.randomUUID();
                            if (A01[6].charAt(4) == 'r') {
                                throw new RuntimeException();
                            }
                            String[] strArr = A01;
                            strArr[4] = "ACuTT9OHS44wxpENU";
                            strArr[2] = "rDA9ItLQjR7JTNF9w";
                            string = uuidRandomUUID.toString();
                            sharedPreferencesA00.edit().putString(strA01, string).apply();
                        }
                        AdInternalSettings.sSettingsBundle.putString(strA00, string);
                    }
                    if (AdInternalSettings.getTestDevicesList().contains(string)) {
                        return true;
                    }
                    A02(string);
                    return false;
                }

                @Override // com.facebook.ads.internal.api.AdSettingsApi
                public final void turnOnDebugger() {
                    JR.A02();
                }
            };
        }
        AdSettingsApi adSettingsApi = A00;
        String[] strArr = A05;
        if (strArr[5].charAt(22) == strArr[3].charAt(22)) {
            throw new RuntimeException();
        }
        A05[7] = "zPBUQH";
        return adSettingsApi;
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AdSizeApi createAdSizeApi(int i10) {
        final JG jgA02 = C0984Kb.A02(i10);
        return new AdSizeApi() { // from class: com.facebook.ads.redexgen.X.8G
            @Override // com.facebook.ads.internal.api.AdSizeApi
            public final int getHeight() {
                return jgA02.A02();
            }

            @Override // com.facebook.ads.internal.api.AdSizeApi
            public final int getWidth() {
                return jgA02.A03();
            }
        };
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AdViewApi createAdViewApi(Context context, String str, AdSize adSize, AdViewParentApi adViewParentApi, AdView adView) {
        return (AdViewApi) AnonymousClass58.A00(new C5B(context, str, adSize, adViewParentApi, adView), AdViewApi.class);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AdViewApi createAdViewApi(Context context, String str, String str2, AdViewParentApi adViewParentApi, AdView adView) throws Exception {
        try {
            return (AdViewApi) AnonymousClass58.A00(new C5B(context, str, str2, adViewParentApi, adView), AdViewApi.class);
        } catch (JE e10) {
            throw new Exception(e10.A01());
        }
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AudienceNetworkActivityApi createAudienceNetworkActivity(final AudienceNetworkActivity audienceNetworkActivity, final AudienceNetworkActivityApi audienceNetworkActivityApi) {
        final C5H c5h = new C5H(audienceNetworkActivity, audienceNetworkActivityApi);
        return new AudienceNetworkActivityApi(audienceNetworkActivity, audienceNetworkActivityApi, c5h) { // from class: com.facebook.ads.redexgen.X.5I
            public static byte[] A03;
            public static String[] A04 = {"kVVxbIvKBpFLpNMn249evg7U1t5DMrkR", "HNBIISUKPJt5lzvo", "tha", "s0U2IqORDUirQkjYFZUhzDbmHPDS66DK", "4XQ6Ra6x1CsG5mP0jlsGo4Oc8x5GsOh7", "mYQ1yQiLRLlGaSwEYEmmcgt3b9ncmm6M", "URRMMekVjcz4ECsO2XmiMnA4WEVCe5QQ", "lW2qNIOuJVr9bvm7hZsN45J1F7Bnv3JY"};
            public boolean A00;
            public final AudienceNetworkActivityApi A01;
            public final C5H A02;

            public static String A00(int i10, int i11, int i12) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
                for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
                    bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 71);
                }
                return new String(bArrCopyOfRange);
            }

            public static void A01() {
                A03 = new byte[]{12, 8, 7, 59, 42, 47, 43, 52, 41, 43, 20, 43, 58, 61, 53, 56, 49, 19, 44, 35, 54, 46, 35, 33, 50, 35, 34, -34, 35, 54, 33, 35, 46, 50, 39, 45, 44, -20, -70, -57, -72, -70, -68, -51, -62, -49, -62, -51, -46};
            }

            static {
                A01();
            }

            {
                this.A01 = audienceNetworkActivityApi;
                this.A02 = c5h;
            }

            private void A02(Throwable th) {
                this.A00 = true;
                this.A02.A0L();
                finish(8);
                C7Q logContext = this.A02.A0K();
                if (logContext != null) {
                    logContext.A07().A9K(A00(38, 11, 18), C06937v.A0C, new C06947w(th));
                    return;
                }
                String strA00 = A00(0, 17, 127);
                if (A04[3].charAt(1) != '0') {
                    throw new RuntimeException();
                }
                A04[6] = "roakWe6n8CepWvGQKms2st32sM0MtJhe";
                Log.e(strA00, A00(17, 21, 119), th);
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
                try {
                    if (this.A00) {
                        this.A01.dump(str, fileDescriptor, printWriter, strArr);
                    } else {
                        this.A02.dump(str, fileDescriptor, printWriter, strArr);
                    }
                } catch (Throwable t10) {
                    A02(t10);
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            public final void finish(int i10) {
                this.A02.finish(i10);
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            public final void onActivityResult(int i10, int i11, Intent intent) {
                try {
                    if (this.A00) {
                        this.A01.onActivityResult(i10, i11, intent);
                    } else {
                        this.A02.onActivityResult(i10, i11, intent);
                        this.A01.onActivityResult(i10, i11, intent);
                    }
                } catch (Throwable t10) {
                    A02(t10);
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            public final void onBackPressed() {
                try {
                    if (this.A00) {
                        return;
                    }
                    this.A02.onBackPressed();
                } catch (Throwable th) {
                    String[] strArr = A04;
                    if (strArr[4].charAt(24) == strArr[5].charAt(24)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A04;
                    strArr2[7] = "o2QAVIvbVP3X0FiUaWNt1f6t7dHcTRBl";
                    strArr2[0] = "vmYtMIbIQwew4451MpW2UPrO9wIbxS87";
                    A02(th);
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            public final void onConfigurationChanged(Configuration configuration) {
                try {
                    if (this.A00) {
                        this.A01.onConfigurationChanged(configuration);
                    } else {
                        this.A02.onConfigurationChanged(configuration);
                        this.A01.onConfigurationChanged(configuration);
                    }
                } catch (Throwable t10) {
                    A02(t10);
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            public final void onCreate(Bundle bundle) {
                this.A01.onCreate(bundle);
                try {
                    this.A02.onCreate(bundle);
                } catch (Throwable t10) {
                    A02(t10);
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            public final void onDestroy() {
                try {
                    if (this.A00) {
                        this.A01.onDestroy();
                    } else {
                        this.A02.onDestroy();
                        this.A01.onDestroy();
                    }
                } catch (Throwable t10) {
                    A02(t10);
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            public final void onPause() {
                try {
                    if (this.A00) {
                        this.A01.onPause();
                    } else {
                        this.A02.onPause();
                        this.A01.onPause();
                    }
                } catch (Throwable t10) {
                    A02(t10);
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            public final void onResume() {
                this.A01.onResume();
                try {
                    if (this.A00) {
                        return;
                    }
                    this.A02.onResume();
                } catch (Throwable t10) {
                    A02(t10);
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            public final void onSaveInstanceState(Bundle bundle) {
                this.A01.onSaveInstanceState(bundle);
                try {
                    if (this.A00) {
                        return;
                    }
                    this.A02.onSaveInstanceState(bundle);
                } catch (Throwable th) {
                    String[] strArr = A04;
                    if (strArr[4].charAt(24) == strArr[5].charAt(24)) {
                        throw new RuntimeException();
                    }
                    A04[6] = "46sQaeWUXFUhhsRkoBzMlxezgaVtku4l";
                    A02(th);
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            public final void onStart() {
                this.A01.onStart();
                try {
                    if (this.A00) {
                        return;
                    }
                    this.A02.onStart();
                } catch (Throwable t10) {
                    A02(t10);
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            public final void onStop() {
                this.A01.onStop();
                try {
                    if (this.A00) {
                        return;
                    }
                    this.A02.onStop();
                } catch (Throwable t10) {
                    A02(t10);
                }
            }

            @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
            public final boolean onTouchEvent(MotionEvent motionEvent) {
                try {
                    if (this.A00) {
                        return this.A01.onTouchEvent(motionEvent);
                    }
                    this.A02.onTouchEvent(motionEvent);
                    return this.A01.onTouchEvent(motionEvent);
                } catch (Throwable t10) {
                    A02(t10);
                }
            }
        };
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public AudienceNetworkAdsApi createAudienceNetworkAdsApi() {
        if (A01 == null) {
            A01 = new AudienceNetworkAdsApi() { // from class: com.facebook.ads.redexgen.X.5K
                @Override // com.facebook.ads.internal.api.AudienceNetworkAdsApi
                public final int getAdFormatForPlacement(String str) {
                    C0979Jw.A02(this);
                    return 0;
                }

                @Override // com.facebook.ads.internal.api.AudienceNetworkAdsApi
                public final void initialize(Context context, MultithreadedBundleWrapper initSettings, AudienceNetworkAds.InitListener initListener) throws Throwable {
                    if (C0979Jw.A02(this)) {
                        return;
                    }
                    if (initListener == null) {
                        try {
                            initListener = new AudienceNetworkAds.InitListener() { // from class: com.facebook.ads.redexgen.X.5J
                                @Override // com.facebook.ads.AudienceNetworkAds.InitListener
                                public final void onInitialized(AudienceNetworkAds.InitResult initResult) {
                                }
                            };
                        } catch (Throwable th) {
                            C0979Jw.A00(th, this);
                            return;
                        }
                    }
                    DynamicLoaderFactory.makeLoader(context).getInitApi().initialize(context, initSettings, initListener, 1);
                }

                @Override // com.facebook.ads.internal.api.AudienceNetworkAdsApi
                public final boolean isInitialized() throws Throwable {
                    if (C0979Jw.A02(this)) {
                        return false;
                    }
                    try {
                        DynamicLoader dynamicLoader = DynamicLoaderFactory.getDynamicLoader();
                        if (dynamicLoader == null) {
                            return false;
                        }
                        return dynamicLoader.getInitApi().isInitialized();
                    } catch (Throwable th) {
                        C0979Jw.A00(th, this);
                        return false;
                    }
                }

                @Override // com.facebook.ads.internal.api.AudienceNetworkAdsApi
                public final void onContentProviderCreated(Context context) throws Throwable {
                    if (C0979Jw.A02(this)) {
                        return;
                    }
                    try {
                        DynamicLoaderFactory.makeLoader(context).getInitApi().onContentProviderCreated(context);
                    } catch (Throwable th) {
                        C0979Jw.A00(th, this);
                    }
                }
            };
        }
        return A01;
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public BidderTokenProviderApi createBidderTokenProviderApi() {
        return getBidderTokenProviderApi();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public DefaultMediaViewVideoRendererApi createDefaultMediaViewVideoRendererApi() {
        return new UJ();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public InterstitialAdApi createInterstitialAd(Context context, String str, InterstitialAd interstitialAd) {
        return (InterstitialAdApi) AnonymousClass58.A00(new C5Q(context, str, interstitialAd), InterstitialAdApi.class);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public MediaViewApi createMediaViewApi() {
        return new YQ();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public MediaViewVideoRendererApi createMediaViewVideoRendererApi() {
        return new C5T();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public C5U createNativeAdApi(NativeAd nativeAd, NativeAdBaseApi nativeAdBaseApi) {
        return new C5U(nativeAd, nativeAdBaseApi);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public C5U createNativeAdApi(NativeAdBase nativeAdBase, NativeAd nativeAd, NativeAdBaseApi nativeAdBaseApi) {
        return new C5U(nativeAdBase, nativeAd, nativeAdBaseApi);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdBaseApi createNativeAdBaseApi(Context context, String str) {
        return new U7(context, str, (J0) U7.A0K(), false);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdBaseApi createNativeAdBaseApi(NativeAdBaseApi nativeAdBaseApi) {
        return new U7((U7) nativeAdBaseApi);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdBase createNativeAdBaseFromBidPayload(Context context, String str, String str2) throws Exception {
        try {
            return U7.A0A(context, str, str2);
        } catch (JE e10) {
            throw new Exception(e10.A01());
        }
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdImageApi createNativeAdImageApi(JSONObject jSONObject) {
        return J1.A00(jSONObject);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdLayoutApi createNativeAdLayoutApi() {
        return new YP();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public J2 createNativeAdRatingApi(JSONObject jSONObject) {
        return J2.A00(jSONObject);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdScrollViewApi createNativeAdScrollViewApi(NativeAdScrollView nativeAdScrollView, Context context, NativeAdsManager nativeAdsManager, NativeAdScrollView.AdViewProvider adViewProvider, int i10, NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes, int i11) {
        return new C5V(nativeAdScrollView, context, nativeAdsManager, adViewProvider, i10, type, nativeAdViewAttributes, i11);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdViewApi createNativeAdViewApi() {
        if (A02 == null) {
            A02 = new NativeAdViewApi() { // from class: com.facebook.ads.redexgen.X.5W
                public static String[] A00 = {"4lhDSJeQx8ImoxNIMYyIsOpW4XJuQDgf", "lqCKp7vrLkXGNxXrvc6I3m7c", "zCZ5ygsfQGVhB3Y237HbJ1q9o76yX", "bq9vw23WcXUY1kk1BWsR1Wz1yPOY5uBm", "", "Hv6Nwq3QZSzEF0Nb8JqXMZqCHWYzLqUn", "tYYpfGiIizklMQ8", "46C5bVFnHWUcfGRcMiONp8ja9wt0MV54"};

                public static View A00(C1337Xw c1337Xw, NativeAd nativeAd, NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes) {
                    if (nativeAdViewAttributes == null) {
                        nativeAdViewAttributes = new NativeAdViewAttributes();
                    }
                    J3 j10 = (J3) nativeAdViewAttributes.getInternalAttributes();
                    U7 internalNativeAd = U7.A0L(nativeAd.getInternalNativeAd());
                    internalNativeAd.A1X(J4.A00(type.getEnumCode()));
                    internalNativeAd.A1W(j10);
                    C0831Dy c0831Dy = new C0831Dy();
                    NativeAdLayout mediumRectTemplateLayout = new NativeAdLayout(c1337Xw, c0831Dy);
                    c0831Dy.A04(mediumRectTemplateLayout, c1337Xw, nativeAd, j10);
                    mediumRectTemplateLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, (int) (Kn.A02 * type.getHeight())));
                    return mediumRectTemplateLayout;
                }

                public static View A01(C1337Xw c1337Xw, NativeAd nativeAd, NativeAdViewAttributes nativeAdViewAttributes) {
                    if (nativeAdViewAttributes == null) {
                        nativeAdViewAttributes = new NativeAdViewAttributes();
                    }
                    U7 u7A0L = U7.A0L(nativeAd.getInternalNativeAd());
                    J3 j10 = (J3) nativeAdViewAttributes.getInternalAttributes();
                    u7A0L.A1X(J4.A0B);
                    u7A0L.A1W(j10);
                    C0831Dy c0831Dy = new C0831Dy();
                    NativeAdLayout nativeAdLayout = new NativeAdLayout(c1337Xw, c0831Dy);
                    c0831Dy.A04(nativeAdLayout, c1337Xw, nativeAd, j10);
                    return nativeAdLayout;
                }

                @Override // com.facebook.ads.internal.api.NativeAdViewApi
                public final View render(Context context, NativeAd nativeAd) {
                    return render(context, nativeAd, (NativeAdViewAttributes) null);
                }

                @Override // com.facebook.ads.internal.api.NativeAdViewApi
                public final View render(Context context, NativeAd nativeAd, NativeAdView.Type type) {
                    return render(context, nativeAd, type, null);
                }

                @Override // com.facebook.ads.internal.api.NativeAdViewApi
                public final View render(Context context, NativeAd nativeAd, NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes) throws Throwable {
                    try {
                        return A00(C5O.A02(context), nativeAd, type, nativeAdViewAttributes);
                    } catch (Throwable th) {
                        C1337Xw c1337XwA02 = C5O.A02(context);
                        if (A00[1].length() == 17) {
                            Throwable t10 = new RuntimeException();
                            throw t10;
                        }
                        String[] strArr = A00;
                        strArr[0] = "2CJ6YuIajjVObDWBrmgwGQhi0qiA6kO3";
                        strArr[3] = "BzZMljeHsN6l5z4UR6G3olqVRWzg5ScF";
                        return C1030Lx.A00(c1337XwA02, th);
                    }
                }

                @Override // com.facebook.ads.internal.api.NativeAdViewApi
                public final View render(Context context, NativeAd nativeAd, NativeAdViewAttributes nativeAdViewAttributes) {
                    C1337Xw contextWrapper;
                    try {
                        if (context instanceof C1337Xw) {
                            contextWrapper = (C1337Xw) context;
                        } else {
                            contextWrapper = C5O.A02(context);
                        }
                        return A01(contextWrapper, nativeAd, nativeAdViewAttributes);
                    } catch (Throwable th) {
                        return C1030Lx.A00(C5O.A02(context), th);
                    }
                }
            };
        }
        return A02;
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdViewAttributesApi createNativeAdViewAttributesApi() {
        return new J3();
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdViewTypeApi createNativeAdViewTypeApi(final int i10) {
        return new NativeAdViewTypeApi(i10) { // from class: com.facebook.ads.redexgen.X.5X
            public final J4 A00;

            {
                this.A00 = J4.A00(i10);
            }

            @Override // com.facebook.ads.internal.api.NativeAdViewTypeApi
            public final int getHeight() {
                return this.A00.A03();
            }

            @Override // com.facebook.ads.internal.api.NativeAdViewTypeApi
            public final int getValue() {
                return this.A00.A04();
            }

            @Override // com.facebook.ads.internal.api.NativeAdViewTypeApi
            public final int getWidth() {
                return this.A00.A05();
            }
        };
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeAdsManagerApi createNativeAdsManagerApi(Context context, String str, int i10) {
        return (NativeAdsManagerApi) AnonymousClass58.A00(new C5Y(context, str, i10), NativeAdsManagerApi.class);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeBannerAdApi createNativeBannerAdApi(NativeBannerAd nativeBannerAd, NativeAdBaseApi nativeAdBaseApi) {
        return new NativeBannerAdApi(nativeAdBaseApi) { // from class: com.facebook.ads.redexgen.X.5c
            public static byte[] A01;
            public static String[] A02 = {"GHtEJsCBxF6ZG8G1CCL5RBmKmDCxDlHG", "8TFtHG5", "ovYsObbmHQ4MgJZYSDt7UbSE4I8Jd3xL", "OStrwIklzSQSoVp6y3SnTe0L", "CizBuXx6tKQSK5P8xVf5ORSYZ1", "CxGaKpsxgS6bhWDX5B71lG4aeRzyf4w9", "ZUquOnXGk9BCY4cqa0yz5KxW6oH5Pvvn", "wvrH4lpYI8UyLhNBrrW8XGK9bs66R2Pk"};
            public final U7 A00;

            public static String A00(int i10, int i11, int i12) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i10, i10 + i11);
                for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
                    bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 40);
                }
                return new String(bArrCopyOfRange);
            }

            public static void A01() {
                A01 = new byte[]{43, 47, 44, Ascii.CAN, 9, 4, 8, 3, 14, 8, 35, 8, Ascii.EM, Ascii.SUB, 2, Ascii.US, 6};
                String[] strArr = A02;
                if (strArr[3].length() == strArr[4].length()) {
                    throw new RuntimeException();
                }
                A02[1] = "g9VMJ7KVDiHxjzY4mov6XPU8OVFxG";
            }

            static {
                A01();
            }

            {
                U7 u7A0L = U7.A0L(nativeAdBaseApi);
                this.A00 = u7A0L;
                u7A0L.A1Y(JI.A04);
            }

            private void A02(ImageView imageView, NativeAdBaseApi nativeAdBaseApi2) {
                U7 u7A0L = U7.A0L(nativeAdBaseApi2);
                YI yi = new YI(this, imageView, u7A0L);
                J1 j1A14 = u7A0L.getAdIcon();
                if (j1A14 != null) {
                    Bitmap preloadedBitmap = u7A0L.A10().A0M(j1A14.getUrl());
                    C1337Xw c1337XwA02 = C5O.A02(imageView.getContext());
                    if (preloadedBitmap != null) {
                        Drawable drawableA05 = U7.A05(c1337XwA02, preloadedBitmap, u7A0L.A1d(), u7A0L.A1C());
                        U7.A0e(drawableA05, imageView);
                        imageView.post(new YH(this, u7A0L, drawableA05));
                        return;
                    } else {
                        YI yi2 = null;
                        C5Z loadImageTask = new C5Z(c1337XwA02, yi, u7A0L.A1d(), yi2);
                        loadImageTask.execute(new C06315b(j1A14.getUrl(), u7A0L.A1C(), yi2));
                        return;
                    }
                }
                U6 u6A15 = u7A0L.A15();
                AdErrorType adErrorType = AdErrorType.NATIVE_AD_IS_NOT_LOADED;
                u7A0L.A11().A0E().A2h(-1L, adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
                if (u6A15 != null) {
                    u6A15.AB6(JD.A00(adErrorType));
                }
                Log.e(A00(0, 17, 69), adErrorType.getDefaultErrorMessage());
            }

            @Override // com.facebook.ads.internal.api.NativeBannerAdApi
            public final void registerViewForInteraction(View view, ImageView imageView) {
                registerViewForInteraction(view, imageView, (List<View>) null);
            }

            @Override // com.facebook.ads.internal.api.NativeBannerAdApi
            public final void registerViewForInteraction(View view, ImageView imageView, List<View> clickableViews) {
                if (imageView != null) {
                    A02(imageView, this.A00);
                }
                if (clickableViews != null) {
                    this.A00.A1M(view, imageView, clickableViews);
                } else {
                    this.A00.A1L(view, imageView);
                }
            }

            @Override // com.facebook.ads.internal.api.NativeBannerAdApi
            public final void registerViewForInteraction(View view, MediaView mediaView) {
                registerViewForInteraction(view, mediaView, (List<View>) null);
            }

            @Override // com.facebook.ads.internal.api.NativeBannerAdApi
            public final void registerViewForInteraction(View view, MediaView mediaView, List<View> list) {
                if (mediaView != null) {
                    YQ yq = (YQ) mediaView.getMediaViewApi();
                    U7 u10 = this.A00;
                    String[] strArr = A02;
                    if (strArr[3].length() == strArr[4].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A02;
                    strArr2[2] = "js1TYeoyNOBe6miaJaLofzAsC6CsUfwk";
                    strArr2[0] = "W1hafLFlhK2580scubVHArACmFSZlS1F";
                    yq.A0M(u10, true);
                }
                if (list != null) {
                    this.A00.A1O(view, mediaView, list);
                } else {
                    this.A00.A1N(view, mediaView);
                }
            }
        };
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeBannerAdViewApi createNativeBannerAdViewApi() {
        if (A03 == null) {
            A03 = new NativeBannerAdViewApi() { // from class: com.facebook.ads.redexgen.X.5d
                public static View A00(C1337Xw c1337Xw, NativeBannerAd nativeBannerAd, NativeBannerAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes) {
                    if (nativeAdViewAttributes == null) {
                        nativeAdViewAttributes = new NativeAdViewAttributes();
                    }
                    U7.A0L(nativeBannerAd.getInternalNativeAd()).A1X(J4.A00(type.getEnumCode()));
                    E8 bannerTemplateLayoutApi = new E8();
                    NativeAdLayout nativeAdLayout = new NativeAdLayout(c1337Xw, bannerTemplateLayoutApi);
                    bannerTemplateLayoutApi.A04(c1337Xw, nativeBannerAd, (J3) nativeAdViewAttributes.getInternalAttributes(), nativeAdLayout);
                    nativeAdLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, (int) (Kn.A02 * type.getHeight())));
                    return nativeAdLayout;
                }

                @Override // com.facebook.ads.internal.api.NativeBannerAdViewApi
                public final View render(Context context, NativeBannerAd nativeBannerAd, NativeBannerAdView.Type type) {
                    return render(context, nativeBannerAd, type, null);
                }

                @Override // com.facebook.ads.internal.api.NativeBannerAdViewApi
                public final View render(Context context, NativeBannerAd nativeBannerAd, NativeBannerAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes) {
                    try {
                        return A00(C5O.A02(context), nativeBannerAd, type, nativeAdViewAttributes);
                    } catch (Throwable th) {
                        return C1030Lx.A00(C5O.A02(context), th);
                    }
                }
            };
        }
        return A03;
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public NativeComponentTagApi createNativeComponentTagApi() {
        return new NativeComponentTagApi() { // from class: com.facebook.ads.redexgen.X.5e
            @Override // com.facebook.ads.internal.api.NativeComponentTagApi
            public final void tagView(View view, NativeAdBase.NativeComponentTag nativeComponentTag) {
                if (view != null && nativeComponentTag != null) {
                    EnumC0999Ks.A03(view, nativeComponentTag);
                }
            }
        };
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public RewardedInterstitialAdApi createRewardedInterstitialAd(Context context, String str, RewardedInterstitialAd rewardedInterstitialAd) {
        return (RewardedInterstitialAdApi) AnonymousClass58.A00(new C06355f(context, str, rewardedInterstitialAd), RewardedInterstitialAdApi.class);
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public RewardedVideoAdApi createRewardedVideoAd(Context context, String str, RewardedVideoAd rewardedVideoAd) {
        return (RewardedVideoAdApi) AnonymousClass58.A00(new C06395j(context, str, rewardedVideoAd), RewardedVideoAdApi.class);
    }

    public static C5N getBidderTokenProviderApi() {
        if (A04 == null) {
            A04 = new C5N();
        }
        C5N c5n = A04;
        if (A05[0].length() == 2) {
            throw new RuntimeException();
        }
        A05[6] = "wbYWwuhs42I1eIPNPpozWjfLzFT5vnXv";
        return c5n;
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public InitApi getInitApi() {
        return A06;
    }

    @Override // com.facebook.ads.internal.dynamicloading.DynamicLoader
    public void maybeInitInternally(Context context) {
        C8J.A0A(C5O.A07(context));
    }
}
