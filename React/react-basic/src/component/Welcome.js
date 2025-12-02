import PropTypes from 'prop-types';

// props는 자식컴퍼넌트의 첫번째 매개변수로 전달됨
function Welcome({name = "기본값", age = 0, addr = "부산시"}){
  return (
    <div>
      나의 첫번째 컴포넌트<br/>
      속성값: {name}<br/>
      나이: {age}<br/>
      주소: {addr}<br/>
    </div>
  )
}

// 프롭스의 타입검증
Welcome.propTypes = {
  name: PropTypes.string,
  age: PropTypes.number,
  addr: PropTypes.string.isRequired
}
export default Welcome;