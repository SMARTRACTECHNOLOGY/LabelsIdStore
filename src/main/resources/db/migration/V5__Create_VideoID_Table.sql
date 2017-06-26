CREATE TABLE tid_video_id(
        tid varchar(20) PRIMARY KEY,
        video_id BIGINT NULL,
        FOREIGN KEY(tid) REFERENCES tids(tid) ON DELETE CASCADE
);
