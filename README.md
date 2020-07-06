how to Implement 

add the below line build.gradle

implementation 'com.github.sunil-singh-chaudhary:Cat-Loading-Dialog:924bc4013b'
    
    
    
    
    
    
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

