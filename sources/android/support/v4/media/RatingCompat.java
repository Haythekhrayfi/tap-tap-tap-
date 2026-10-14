package android.support.v4.media;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.material.internal.StaticLayoutBuilderCompat;

/* JADX INFO: loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f393e;

    public static class a implements Parcelable.Creator<RatingCompat> {
        @Override // android.os.Parcelable.Creator
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public RatingCompat[] newArray(int i10) {
            return new RatingCompat[i10];
        }
    }

    public RatingCompat(int i10, float f10) {
        this.f391c = i10;
        this.f392d = f10;
    }

    public static RatingCompat a(Object obj) {
        RatingCompat ratingCompat;
        float f10;
        String strA;
        RatingCompat ratingCompat2 = null;
        if (obj != null) {
            Rating rating = (Rating) obj;
            int ratingStyle = rating.getRatingStyle();
            if (!rating.isRated()) {
                switch (ratingStyle) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        ratingCompat2 = new RatingCompat(ratingStyle, -1.0f);
                        break;
                }
            } else {
                switch (ratingStyle) {
                    case 1:
                        ratingCompat = new RatingCompat(1, rating.hasHeart() ? 1.0f : 0.0f);
                        ratingCompat2 = ratingCompat;
                        break;
                    case 2:
                        ratingCompat = new RatingCompat(2, rating.isThumbUp() ? 1.0f : 0.0f);
                        ratingCompat2 = ratingCompat;
                        break;
                    case 3:
                    case 4:
                    case 5:
                        float starRating = rating.getStarRating();
                        if (ratingStyle == 3) {
                            f10 = 3.0f;
                        } else if (ratingStyle != 4) {
                            if (ratingStyle != 5) {
                                strA = j.a("Invalid rating style (", ratingStyle, ") for a star rating");
                            } else {
                                f10 = 5.0f;
                            }
                            Log.e("Rating", strA);
                        } else {
                            f10 = 4.0f;
                        }
                        if (starRating >= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && starRating <= f10) {
                            ratingCompat2 = new RatingCompat(ratingStyle, starRating);
                        } else {
                            strA = "Trying to set out of range star-based rating";
                            Log.e("Rating", strA);
                        }
                        break;
                    case 6:
                        float percentRating = rating.getPercentRating();
                        if (percentRating >= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD && percentRating <= 100.0f) {
                            ratingCompat2 = new RatingCompat(6, percentRating);
                        } else {
                            Log.e("Rating", "Invalid percentage-based rating value");
                        }
                        break;
                    default:
                        return null;
                }
            }
            ratingCompat2.f393e = obj;
        }
        return ratingCompat2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.f391c;
    }

    public String toString() {
        StringBuilder sbA = defpackage.a.a("Rating:style=");
        sbA.append(this.f391c);
        sbA.append(" rating=");
        float f10 = this.f392d;
        sbA.append(f10 < StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD ? "unrated" : String.valueOf(f10));
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f391c);
        parcel.writeFloat(this.f392d);
    }
}
