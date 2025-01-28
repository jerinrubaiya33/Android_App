
//    class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContentView(R.layout.activity_main)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
//    }
//}
//




//
//package com.ebook.com
//
//import android.os.Bundle
//import android.view.MenuItem
//import android.view.View
//import android.widget.ImageView
//import androidx.appcompat.app.AppCompatActivity
//import androidx.drawerlayout.widget.DrawerLayout
//import com.google.android.material.navigation.NavigationView
//import com.ebook.com.databinding.ActivityMainBinding  // Ensure this import exists
//import com.ebook.com.Models.CategoryMode  // Ensure correct package name
//
//class MainActivity : AppCompatActivity() {
//    private var binding: ActivityMainBinding? = null
//    private var navigationView: NavigationView? = null
//    private var drawerLayout: DrawerLayout? = null
//    private var menu: ImageView? = null
//    private var header: View? = null
//    private var list: ArrayList<CategoryMode>? = null
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        // Inflate the layout using ViewBinding
//        binding = ActivityMainBinding.inflate(layoutInflater)
//        setContentView(binding?.root)
//
//        // Initialize UI components safely
//        drawerLayout = binding?.drawerLayout
//        navigationView = binding?.navigationView
//        menu = binding?.imageView2
//
//        // Get header from NavigationView
//        navigationView?.let {
//            header = it.getHeaderView(0)
//        }
//
//        // Initialize the list
//        list = ArrayList()
//
//        // Set up navigation menu
//        setupNavigationMenu()
//    }
//
//    private fun setupNavigationMenu() {
//        menu?.setOnClickListener {
//            if (drawerLayout?.isDrawerOpen(navigationView!!) == true) {
//                drawerLayout?.closeDrawer(navigationView!!)
//            } else {
//                drawerLayout?.openDrawer(navigationView!!)
//            }
//        }
//
//        navigationView?.setNavigationItemSelectedListener { item: MenuItem ->
//            when (item.itemId) {
//                // Handle menu clicks here (example)
//                R.id.main -> {
//                    // Perform action
//                    true
//                }
//                else -> false
//            }
//        }
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        binding = null  // Prevent memory leaks
//    }
//}























