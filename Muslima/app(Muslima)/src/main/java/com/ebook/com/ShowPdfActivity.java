    package com.ebook.com;
    import android.os.Bundle;
    import androidx.activity.EdgeToEdge;
    import androidx.appcompat.app.AppCompatActivity;
    import androidx.core.graphics.Insets;
    import androidx.core.view.ViewCompat;
    import androidx.core.view.WindowInsetsCompat;
    import com.github.barteksc.pdfviewer.PDFView;
    import android.view.View; // Make sure this is imported

    import com.ebook.com.databinding.ActivityShowPdfBinding;
//    import com.google.android.filament.View;

    public class ShowPdfActivity extends AppCompatActivity {

        ActivityShowPdfBinding binding;
        private  String title;
        private int position;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            binding = ActivityShowPdfBinding.inflate(getLayoutInflater());

            setContentView(binding.getRoot());
            title = getIntent().getStringExtra("title");
            position = getIntent().getIntExtra("pos", 0);

            binding.title.setText(title);
//            if (position==0){
//                   binding.pdfView.fromAsset("থার্টিফার্স্ট নাইট এবং ইসলাম").load();
//             }
//            else if (position==1){
//                binding.pdfView.fromAsset("মুসলমানদের পোশাক ও পর্দা").load();
//            }
            if (position==0){
                binding.pdfView.fromAsset("Muslim_Dress_Veil.pdf").load();
            }
            else if (position==1){
                binding.pdfView.fromAsset("Thirtyfirst_Night_Islam.pdf").load();
            }

            binding.back.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onBackPressed();
            }
            });
        }
    }