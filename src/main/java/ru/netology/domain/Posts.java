package ru.netology.domain;

import java.lang.reflect.Array;

public class Posts {       //https://vk.com/dev/objects/post
    private int id;
    private int owner_id;
    private int from_id;
    private int created_by;
    private int date;
    private String text;
    private int reply_owner_id;
    private int reply_post_id;
    private int friends_only;
    private CommentInformation commentInformation;
    private LikeInformation likeInformation;
    private RepostInformation repostInformation;
    private String post_type;
    private ReactionInformation reactionInformation;   //Реакции смайликами
    private Array attachments[];
    private Geo geo;
    private int signer_id;
    private Array copyHistory[];
    private int canPin;
    private int canDelete;
    private int canEdit;
    private int isPined;
    private int markedAsAds;
    private boolean isFavorite;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(int owner_id) {
        this.owner_id = owner_id;
    }

    public int getFrom_id() {
        return from_id;
    }

    public void setFrom_id(int from_id) {
        this.from_id = from_id;
    }

    public int getCreated_by() {
        return created_by;
    }

    public void setCreated_by(int created_by) {
        this.created_by = created_by;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getReply_owner_id() {
        return reply_owner_id;
    }

    public void setReply_owner_id(int reply_owner_id) {
        this.reply_owner_id = reply_owner_id;
    }

    public int getReply_post_id() {
        return reply_post_id;
    }

    public void setReply_post_id(int reply_post_id) {
        this.reply_post_id = reply_post_id;
    }

    public int getFriends_only() {
        return friends_only;
    }

    public void setFriends_only(int friends_only) {
        this.friends_only = friends_only;
    }

    public CommentInformation getCommentInformation() {
        return commentInformation;
    }

    public void setCommentInformation(CommentInformation commentInformation) {
        this.commentInformation = commentInformation;
    }

    public LikeInformation getLikeInformation() {
        return likeInformation;
    }

    public void setLikeInformation(LikeInformation likeInformation) {
        this.likeInformation = likeInformation;
    }

    public RepostInformation getRepostInformation() {
        return repostInformation;
    }

    public void setRepostInformation(RepostInformation repostInformation) {
        this.repostInformation = repostInformation;
    }

    public String getPost_type() {
        return post_type;
    }

    public void setPost_type(String post_type) {
        this.post_type = post_type;
    }

    public ReactionInformation getReactionInformation() {
        return reactionInformation;
    }

    public void setReactionInformation(ReactionInformation reactionInformation) {
        this.reactionInformation = reactionInformation;
    }

    public Array[] getAttachments() {
        return attachments;
    }

    public void setAttachments(Array[] attachments) {
        this.attachments = attachments;
    }

    public Geo getGeo() {
        return geo;
    }

    public void setGeo(Geo geo) {
        this.geo = geo;
    }

    public int getSigner_id() {
        return signer_id;
    }

    public void setSigner_id(int signer_id) {
        this.signer_id = signer_id;
    }

    public Array[] getCopyHistory() {
        return copyHistory;
    }

    public void setCopyHistory(Array[] copyHistory) {
        this.copyHistory = copyHistory;
    }

    public int getCanPin() {
        return canPin;
    }

    public void setCanPin(int canPin) {
        this.canPin = canPin;
    }

    public int getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(int canDelete) {
        this.canDelete = canDelete;
    }

    public int getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(int canEdit) {
        this.canEdit = canEdit;
    }

    public int getIsPined() {
        return isPined;
    }

    public void setIsPined(int isPined) {
        this.isPined = isPined;
    }

    public int getMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(int markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }
}
