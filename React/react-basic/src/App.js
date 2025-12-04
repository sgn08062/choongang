import './css/App.css';
import styled from './css/App.module.css';

function App(){

  return(
    <>
     <div>
        <h1 style={{textAlign:"center", color:"red"}}>리액트에서 직접 style 하기</h1>
        <div className="app_header">
          내용......
        </div>

        {/* 모듈 css */}
        <div className={styled.app_wrap}>
          <div className={styled.item}>아이템</div>
          <div className={styled.item}>아이템</div>
          <div className={styled.item}>아이템</div>
          <div className={styled.item}>아이템</div>
        </div>

        {/* 모듈 css의 전역선택자 */}
        <h3 className='title'>:global의 사용</h3>
        <h3 className='content'>:global의 사용</h3>
      </div> 
    </>
  )
}

export default App;