package q8;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import ch.qos.logback.core.CoreConstants;
import com.inscode.autoclicker.R;
import fd.j0;
import jc.w;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public final class b extends LinearLayout {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uc.a<w> f34801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final uc.a<w> f34802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AppCompatTextView f34803e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, uc.a<w> aVar, uc.a<w> aVar2) {
        super(context);
        j0.i(context, CoreConstants.CONTEXT_SCOPE_VALUE);
        j0.i(aVar, "onCloseAction");
        j0.i(aVar2, "onCopyAction");
        this.f34801c = aVar;
        this.f34802d = aVar2;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setTextColor(-1);
        appCompatTextView.setGravity(3);
        this.f34803e = appCompatTextView;
        int iB = k9.i.b(8);
        setPadding(iB, iB, iB, iB);
        final int i10 = 0;
        setOrientation(0);
        setBackgroundColor(Color.argb(186, 0, 0, 0));
        setElevation(getResources().getDimension(R.dimen.div_shadow_elevation));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setPadding(0, 0, iB, 0);
        final int i11 = 1;
        linearLayout.setOrientation(1);
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(android.R.drawable.ic_menu_close_clear_cancel);
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: q8.a

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ b f34800d;

            {
                this.f34800d = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        b bVar = this.f34800d;
                        j0.i(bVar, "this$0");
                        bVar.f34801c.invoke();
                        break;
                    default:
                        b bVar2 = this.f34800d;
                        j0.i(bVar2, "this$0");
                        bVar2.f34802d.invoke();
                        break;
                }
            }
        });
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(android.R.drawable.ic_menu_save);
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: q8.a

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ b f34800d;

            {
                this.f34800d = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        b bVar = this.f34800d;
                        j0.i(bVar, "this$0");
                        bVar.f34801c.invoke();
                        break;
                    default:
                        b bVar2 = this.f34800d;
                        j0.i(bVar2, "this$0");
                        bVar2.f34802d.invoke();
                        break;
                }
            }
        });
        linearLayout.addView(imageView, new LinearLayout.LayoutParams(-2, -2));
        linearLayout.addView(imageView2, new LinearLayout.LayoutParams(-2, -2));
        addView(linearLayout, new LinearLayout.LayoutParams(k9.i.b(32), -2));
        addView(appCompatTextView, new LinearLayout.LayoutParams(-2, -2));
    }
}
