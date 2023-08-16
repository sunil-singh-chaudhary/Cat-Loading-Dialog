how to Implement 

add the below line build.gradle


   implementation 'com.github.sunil-singh-chaudhary:Cat-Loading-Dialog:924bc4013b'

      repositories {
          google()
          jcenter()
          maven { url 'https://jitpack.io' }
      }
    
    
    
    
    show_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cat_dialog = new CatLoadingView();
                cat_dialog.show( getSupportFragmentManager(), "1" );
            }
        } );
        
        
        
        
        dismiss_btn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cat_dialog.dismiss();
            }
        } );



![ezgif com-video-to-gif](https://user-images.githubusercontent.com/10194731/86588881-30a9c780-bfaa-11ea-9d47-560972e13580.gif)

