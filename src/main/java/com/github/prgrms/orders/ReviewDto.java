package com.github.prgrms.orders;

public class ReviewDto {
    
    private String content;

    public void setContent(String content){
        this.content = content;
    }

    public String getContent(){
        return this.content;
    }

    public ReviewDto(){

    }

    public ReviewDto(String content){
        this.content = content;
    }
}
