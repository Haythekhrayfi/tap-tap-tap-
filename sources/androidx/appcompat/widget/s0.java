package androidx.appcompat.widget;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.applovin.sdk.AppLovinEventTypes;
import com.developer.filepicker.model.DialogConfigs;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class s0 extends t0.c implements View.OnClickListener {
    public static final /* synthetic */ int A = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final SearchView f1338n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final SearchableInfo f1339o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Context f1340p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final WeakHashMap<String, Drawable.ConstantState> f1341q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f1342r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f1343s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ColorStateList f1344t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f1345u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f1346v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f1347w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f1348x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f1349y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f1350z;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f1351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f1352b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ImageView f1353c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ImageView f1354d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ImageView f1355e;

        public a(View view) {
            this.f1351a = (TextView) view.findViewById(R.id.text1);
            this.f1352b = (TextView) view.findViewById(R.id.text2);
            this.f1353c = (ImageView) view.findViewById(R.id.icon1);
            this.f1354d = (ImageView) view.findViewById(R.id.icon2);
            this.f1355e = (ImageView) view.findViewById(com.inscode.autoclicker.R.id.edit_query);
        }
    }

    public s0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.f1343s = 1;
        this.f1345u = -1;
        this.f1346v = -1;
        this.f1347w = -1;
        this.f1348x = -1;
        this.f1349y = -1;
        this.f1350z = -1;
        this.f1338n = searchView;
        this.f1339o = searchableInfo;
        this.f1342r = searchView.getSuggestionCommitIconResId();
        this.f1340p = context;
        this.f1341q = weakHashMap;
    }

    public static String k(Cursor cursor, int i10) {
        if (i10 == -1) {
            return null;
        }
        try {
            return cursor.getString(i10);
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e10);
            return null;
        }
    }

    @Override // t0.a, t0.b.a
    public void a(Cursor cursor) {
        try {
            super.a(cursor);
            if (cursor != null) {
                this.f1345u = cursor.getColumnIndex("suggest_text_1");
                this.f1346v = cursor.getColumnIndex("suggest_text_2");
                this.f1347w = cursor.getColumnIndex("suggest_text_2_url");
                this.f1348x = cursor.getColumnIndex("suggest_icon_1");
                this.f1349y = cursor.getColumnIndex("suggest_icon_2");
                this.f1350z = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e10) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e10);
        }
    }

    @Override // t0.a, t0.b.a
    public CharSequence b(Cursor cursor) {
        String strK;
        String strK2;
        if (cursor == null) {
            return null;
        }
        String strK3 = k(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (strK3 != null) {
            return strK3;
        }
        if (this.f1339o.shouldRewriteQueryFromData() && (strK2 = k(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return strK2;
        }
        if (!this.f1339o.shouldRewriteQueryFromText() || (strK = k(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return strK;
    }

    @Override // t0.a, t0.b.a
    public Cursor c(CharSequence charSequence) {
        String string = charSequence == null ? "" : charSequence.toString();
        if (this.f1338n.getVisibility() == 0 && this.f1338n.getWindowVisibility() == 0) {
            try {
                Cursor cursorJ = j(this.f1339o, string, 50);
                if (cursorJ != null) {
                    cursorJ.getCount();
                    return cursorJ;
                }
            } catch (RuntimeException e10) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e10);
            }
        }
        return null;
    }

    @Override // t0.a
    public void d(View view, Context context, Cursor cursor) throws FileNotFoundException {
        Drawable drawableI;
        String string;
        Drawable drawable;
        CharSequence charSequenceK;
        a aVar = (a) view.getTag();
        int i10 = this.f1350z;
        int i11 = i10 != -1 ? cursor.getInt(i10) : 0;
        if (aVar.f1351a != null) {
            String strK = k(cursor, this.f1345u);
            TextView textView = aVar.f1351a;
            textView.setText(strK);
            textView.setVisibility(TextUtils.isEmpty(strK) ? 8 : 0);
        }
        if (aVar.f1352b != null) {
            String strK2 = k(cursor, this.f1347w);
            if (strK2 != null) {
                if (this.f1344t == null) {
                    TypedValue typedValue = new TypedValue();
                    this.f1340p.getTheme().resolveAttribute(com.inscode.autoclicker.R.attr.textColorSearchUrl, typedValue, true);
                    this.f1344t = this.f1340p.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(strK2);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f1344t, null), 0, strK2.length(), 33);
                charSequenceK = spannableString;
            } else {
                charSequenceK = k(cursor, this.f1346v);
            }
            if (TextUtils.isEmpty(charSequenceK)) {
                TextView textView2 = aVar.f1351a;
                if (textView2 != null) {
                    textView2.setSingleLine(false);
                    aVar.f1351a.setMaxLines(2);
                }
            } else {
                TextView textView3 = aVar.f1351a;
                if (textView3 != null) {
                    textView3.setSingleLine(true);
                    aVar.f1351a.setMaxLines(1);
                }
            }
            TextView textView4 = aVar.f1352b;
            textView4.setText(charSequenceK);
            textView4.setVisibility(TextUtils.isEmpty(charSequenceK) ? 8 : 0);
        }
        ImageView imageView = aVar.f1353c;
        if (imageView != null) {
            int i12 = this.f1348x;
            if (i12 == -1) {
                drawableI = null;
            } else {
                drawableI = i(cursor.getString(i12));
                if (drawableI == null) {
                    ComponentName searchActivity = this.f1339o.getSearchActivity();
                    String strFlattenToShortString = searchActivity.flattenToShortString();
                    if (this.f1341q.containsKey(strFlattenToShortString)) {
                        Drawable.ConstantState constantState = this.f1341q.get(strFlattenToShortString);
                        drawableI = constantState == null ? null : constantState.newDrawable(this.f1340p.getResources());
                    } else {
                        PackageManager packageManager = this.f1340p.getPackageManager();
                        try {
                            ActivityInfo activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                            int iconResource = activityInfo.getIconResource();
                            if (iconResource != 0) {
                                drawable = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                                if (drawable == null) {
                                    StringBuilder sbA = r0.a("Invalid icon resource ", iconResource, " for ");
                                    sbA.append(searchActivity.flattenToShortString());
                                    string = sbA.toString();
                                    Log.w("SuggestionsAdapter", string);
                                    drawable = null;
                                }
                            } else {
                                drawable = null;
                            }
                        } catch (PackageManager.NameNotFoundException e10) {
                            string = e10.toString();
                        }
                        this.f1341q.put(strFlattenToShortString, drawable == null ? null : drawable.getConstantState());
                        drawableI = drawable;
                    }
                    if (drawableI == null) {
                        drawableI = this.f1340p.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView.setImageDrawable(drawableI);
            if (drawableI == null) {
                imageView.setVisibility(4);
            } else {
                imageView.setVisibility(0);
                drawableI.setVisible(false, false);
                drawableI.setVisible(true, false);
            }
        }
        ImageView imageView2 = aVar.f1354d;
        if (imageView2 != null) {
            int i13 = this.f1349y;
            Drawable drawableI2 = i13 != -1 ? i(cursor.getString(i13)) : null;
            imageView2.setImageDrawable(drawableI2);
            if (drawableI2 == null) {
                imageView2.setVisibility(8);
            } else {
                imageView2.setVisibility(0);
                drawableI2.setVisible(false, false);
                drawableI2.setVisible(true, false);
            }
        }
        int i14 = this.f1343s;
        if (i14 != 2 && (i14 != 1 || (i11 & 1) == 0)) {
            aVar.f1355e.setVisibility(8);
            return;
        }
        aVar.f1355e.setVisibility(0);
        aVar.f1355e.setTag(aVar.f1351a.getText());
        aVar.f1355e.setOnClickListener(this);
    }

    @Override // t0.c, t0.a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewInflate = this.f35659m.inflate(this.f35657k, viewGroup, false);
        viewInflate.setTag(new a(viewInflate));
        ((ImageView) viewInflate.findViewById(com.inscode.autoclicker.R.id.edit_query)).setImageResource(this.f1342r);
        return viewInflate;
    }

    @Override // t0.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View viewInflate = this.f35659m.inflate(this.f35658l, viewGroup, false);
            if (viewInflate != null) {
                ((a) viewInflate.getTag()).f1351a.setText(e10.toString());
            }
            return viewInflate;
        }
    }

    @Override // t0.a, android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i10, view, viewGroup);
        } catch (RuntimeException e10) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e10);
            View viewG = g(this.f1340p, this.f35648e, viewGroup);
            ((a) viewG.getTag()).f1351a.setText(e10.toString());
            return viewG;
        }
    }

    public Drawable h(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException(q0.a("No authority: ", uri));
        }
        try {
            Resources resourcesForApplication = this.f1340p.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException(q0.a("No path: ", uri));
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException(q0.a("Single path segment is not a resource ID: ", uri));
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException(q0.a("More than two path segments: ", uri));
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException(q0.a("No resource found for: ", uri));
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException(q0.a("No package found for authority: ", uri));
        }
    }

    public final Drawable i(String str) throws FileNotFoundException {
        Drawable drawableH = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int i10 = Integer.parseInt(str);
                String str2 = "android.resource://" + this.f1340p.getPackageName() + DialogConfigs.DIRECTORY_SEPERATOR + i10;
                Drawable.ConstantState constantState = this.f1341q.get(str2);
                Drawable drawableNewDrawable = constantState == null ? null : constantState.newDrawable();
                if (drawableNewDrawable != null) {
                    return drawableNewDrawable;
                }
                Context context = this.f1340p;
                Object obj = e0.a.f28964a;
                Drawable drawableB = e0.a.c.b(context, i10);
                if (drawableB != null) {
                    this.f1341q.put(str2, drawableB.getConstantState());
                }
                return drawableB;
            } catch (Resources.NotFoundException unused) {
                Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
                return null;
            } catch (NumberFormatException unused2) {
                Drawable.ConstantState constantState2 = this.f1341q.get(str);
                Drawable drawableNewDrawable2 = constantState2 == null ? null : constantState2.newDrawable();
                if (drawableNewDrawable2 != null) {
                    return drawableNewDrawable2;
                }
                Uri uri = Uri.parse(str);
                try {
                    if ("android.resource".equals(uri.getScheme())) {
                        try {
                            drawableH = h(uri);
                        } catch (Resources.NotFoundException unused3) {
                            throw new FileNotFoundException("Resource does not exist: " + uri);
                        }
                    } else {
                        InputStream inputStreamOpenInputStream = this.f1340p.getContentResolver().openInputStream(uri);
                        if (inputStreamOpenInputStream == null) {
                            throw new FileNotFoundException("Failed to open " + uri);
                        }
                        try {
                            Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamOpenInputStream, null);
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (IOException e10) {
                                Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e10);
                            }
                            drawableH = drawableCreateFromStream;
                        } catch (Throwable th) {
                            try {
                                inputStreamOpenInputStream.close();
                            } catch (IOException e11) {
                                Log.e("SuggestionsAdapter", "Error closing icon stream for " + uri, e11);
                            }
                            throw th;
                        }
                    }
                } catch (FileNotFoundException e12) {
                    Log.w("SuggestionsAdapter", "Icon not found: " + uri + ", " + e12.getMessage());
                }
                if (drawableH != null) {
                    this.f1341q.put(str, drawableH.getConstantState());
                }
            }
        }
        return drawableH;
    }

    public Cursor j(SearchableInfo searchableInfo, String str, int i10) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme(AppLovinEventTypes.USER_VIEWED_CONTENT).authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i10 > 0) {
            builderFragment.appendQueryParameter("limit", String.valueOf(i10));
        }
        return this.f1340p.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f35648e;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f35648e;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f1338n.k((CharSequence) tag);
        }
    }
}
