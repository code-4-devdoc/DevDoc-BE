# 전체 개요  
## https://github.com/code-4-devdoc/DevDoc  
## https://github.com/code-4-devdoc/DevDoc-FE  
## https://github.com/code-4-devdoc/DevDoc-BE  
<br/>

---

# 메모
## H2-Console
#### http://localhost:8080/h2-console  
- JDBC URL : jdbc:h2:mem:testdb  
- UserName : root  
- Password : root
<br/>

---

# DB 설계
### UUser : 
### Resume : id title
### SSkill : id resume_id status content
<br/>

- Resume 생성 시 Skill 3개가 미리 생성
- Skill.content : Null -> .status : False
- Skill.content : NotNull -> .status : True
- 기존의방식) Skill 테이블 생성 시 POST 메소드를 사용
- 이번테스트) Skill 테이블을 미리 생성 후 PUT 메소드를 사용 (=덮어쓰기)
<br/>

---

# API 설계
#### `GET /api/resumes/`
> Resume 목록 조회 : Id와 Title만

#### `GET /api/resumes/{resumeId}`
> ResumeId 조회 : Status = T 인 모든 테이블

#### `GET /api/resumes/{resumeId}/test`
> ResumeId 조회 : 모든 테이블 (DB 작동 확인용)

#### `POST /api/resumes`
> ResumeId 생성 ~ SkillId x3 생성

#### `DEL /api/resumes/{resumeId}`
> ResumeId 삭제

#### `PUT /api/resumes/{resumeId}/title`
> ResumeId 업데이트 : Title만

#### `PUT /api/resumes//{skillId}/skills`
> SkillId 업데이트
