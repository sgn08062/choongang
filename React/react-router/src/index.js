import {BrowserRouter} from 'react-router-dom'; //라우터
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';

// 리덕스 스토어
import {Provider} from 'react-redux';
import { store } from './redux/AppStore';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <BrowserRouter>
    {/* 리덕스를 적용하고 싶은 컴포넌트에 상위를 Provider로 감싸줌.
        동작시킬 store를 전달한다.
    */}
    <Provider store={store}>
      <App />
    </Provider>
  </BrowserRouter>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
