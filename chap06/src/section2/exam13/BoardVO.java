package section2.exam13;

import java.util.Date;

public class BoardVO {
	int id; // �Խñ� ��ȣ
	String title; // ����
	String contents; // ����
	String writer; // �ۼ���
	int hit;  // ��ȸ��
	String like; // ���ƿ�
	Date regDate; // �����
	Date updateDate; // ������
	int replyCount; // ��ۼ�
	
	
	
	// ������
	public BoardVO(String title, String contents, String writer) {
		this.title = title;
		this.contents = contents;
		this.writer = writer;
	
	}


	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getContents() {
		return contents;
	}



	public void setContents(String contents) {
		this.contents = contents;
	}



	public String getWriter() {
		return writer;
	}



	public void setWriter(String writer) {
		this.writer = writer;
	}



	public int getHit() {
		return hit;
	}



	public void setHit(int hit) {
		this.hit = hit;
	}



	public String getLike() {
		return like;
	}



	public void setLike(String like) {
		this.like = like;
	}



	public Date getRegDate() {
		return regDate;
	}



	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}



	public Date getUpdateDate() {
		return updateDate;
	}



	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}



	public int getReplyCount() {
		return replyCount;
	}



	public void setReplyCount(int replyCount) {
		this.replyCount = replyCount;
	}
	
}
